package atelier.student.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/add")
    public Iterable<Student> getAllStudents() {
        studentRepository.save(new Student("Edem", "Gari"));
        studentRepository.save(new Student("Mariem", "Sorciere"));
        studentRepository.save(new Student("Gab", "Divine"));
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

    

}
