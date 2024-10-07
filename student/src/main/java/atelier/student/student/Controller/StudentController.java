package atelier.student.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import atelier.student.student.Entity.Student;
import atelier.student.student.Service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Iterable<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/create")
    public Student createStudent(
        @RequestParam(value = "prenom", defaultValue = "Unknown") String prenom,
        @RequestParam(value = "nom", defaultValue = "Unknown") String nom
    ) {
        return studentService.createStudent(prenom, nom);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }    
}
