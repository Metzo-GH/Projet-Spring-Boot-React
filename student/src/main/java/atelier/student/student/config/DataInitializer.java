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
            stageRepository.save(new Stage("DevOPS", "Google"));
            stageRepository.save(new Stage("MOA", "Netflix"));
        };
    }
}
