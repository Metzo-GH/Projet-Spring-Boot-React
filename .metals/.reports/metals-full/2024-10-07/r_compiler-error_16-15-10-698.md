file://<WORKSPACE>/student/src/main/java/atelier/student/student/Controller/StageControler.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
/run/user/17369/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], /run/user/17369/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 1099
uri: file://<WORKSPACE>/student/src/main/java/atelier/student/student/Controller/StageControler.java
text:
```scala
package atelier.student.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atelier.student.student.Entity.Stage;
import atelier.student.student.Repository.StageRepository;


@RestController
@RequestMapping("/stages")
public class StageControler {

    @Autowired
    private StageRepository stageRepository;
    
    @GetMapping
    public Iterable<Stage> getStages() {
        return stageRepository.findAll();
    }

    @GetMapping("/create")
    public Stage createStage(
        @RequestParam(value = "titre", defaultValue = "Unknown") String titre,
        @RequestParam(value = "description", defaultValue = "Unknown") String description
    ) {
        Stage newStage = new Stage(titre, description);
        return stageRepository.save(newStage);
    }

    @GetMapping(@@"{id}")
    public Stage getStage(@RequestParam(value = "id") Long id) {
        return stageRepository.findById(id).get();
    }
}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:36)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:389)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator