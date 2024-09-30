package atelier.student.student.Controller;

import atelier.student.student.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @GetMapping("/add")
    public List<Student> getAllStudents() {
        students.add(new Student("Edem", "Gari"));
        students.add(new Student("Mariem", "Sorciere"));
        students.add(new Student("Gab", "Divine"));
        return students;
    }

    @GetMapping("/create")
    public Student createStudent(
        @RequestParam(value = "prenom", defaultValue = "Unknown") String prenom,
        @RequestParam(value = "nom", defaultValue = "Unknown") String nom
    ) {
        Student newStudent = new Student(prenom, nom);
        students.add(newStudent);
        return newStudent;
    }

    @GetMapping
    public List<Student> getStudents() {
        return students;
    }
}
