package atelier.student.student.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import atelier.student.student.Entity.Stage;

public interface StageRepository extends CrudRepository<Stage, Long> {

    List<Stage> findByTitre(String titre);

    Stage findById(long id);   
}