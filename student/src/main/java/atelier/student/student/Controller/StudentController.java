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
public class StudentController {

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
