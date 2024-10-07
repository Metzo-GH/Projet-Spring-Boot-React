package atelier.student.student.Repository;

import org.springframework.data.repository.CrudRepository;
import atelier.student.student.Entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

    
}
