package atelier.student.student.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import atelier.student.student.Entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByNom(String nom);

    Student findById(long id);
    
}
