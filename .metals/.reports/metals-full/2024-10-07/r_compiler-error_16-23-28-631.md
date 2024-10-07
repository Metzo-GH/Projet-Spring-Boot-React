file://<WORKSPACE>/student/src/main/java/atelier/student/student/Controller/StudentController.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
/run/user/17369/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], /run/user/17369/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 594
uri: file://<WORKSPACE>/student/src/main/java/atelier/student/student/Controller/StudentController.java
text:
```scala
package atelier.student.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import atelier.student.student.Entity.Student;
import atelier.student.student.Repository.StudentRepository;


@RestController
@RequestMapping("/student")
public clas@@s StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/create")
    public Student createStudent(
        @RequestParam(value = "prenom", defaultValue = "Unknown") String prenom,
        @RequestParam(value = "nom", defaultValue = "Unknown") String nom
    ) {
        Student newStudent = new Student(prenom, nom);
        return studentRepository.save(newStudent);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentRepository.findById(id).orElse(null);
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