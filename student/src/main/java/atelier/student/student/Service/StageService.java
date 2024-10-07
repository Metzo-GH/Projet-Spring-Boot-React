package atelier.student.student.Service;

import atelier.student.student.Entity.Stage;

public interface StageService {
    Iterable<Stage> getAllStages();
    Stage createStage(String titre, String description);
    Stage getStageById(Long id);
}
