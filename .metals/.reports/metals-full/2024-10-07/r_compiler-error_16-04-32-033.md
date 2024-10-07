file://<WORKSPACE>/student/src/main/java/atelier/student/student/config/DataInitializer.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
/run/user/17369/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], /run/user/17369/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 940
uri: file://<WORKSPACE>/student/src/main/java/atelier/student/student/config/DataInitializer.java
text:
```scala
package atelier.student.student.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import atelier.student.student.Entity.Student;
import atelier.student.student.Entity.Stage;
import atelier.student.student.Repository.StudentRepository;
import atelier.student.student.Repository.StageRepository;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(StudentRepository studentRepository, StageRepository stageRepository) {
        return args -> {
            // Ajouter des étudiants
            studentRepository.save(new Student("GAb", "Smith"));
            studentRepository.save(new Student("John", "Mariem"));

            // Ajouter des stages
            stageRepository.save(new Stage("DevOPS", "Description du stage 1"));
            stageRepository.save(new Stage("Stag@@e 2", "Description du stage 2"));
        };
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