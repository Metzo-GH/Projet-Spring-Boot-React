package atelier.student.student.Service;

import atelier.student.student.Entity.Student;

public interface StudentService {
    Iterable<Student> getAllStudents();
    Student createStudent(String prenom, String nom);
    Student getStudentById(Long id);
}
