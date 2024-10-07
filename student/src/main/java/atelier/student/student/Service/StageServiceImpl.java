package atelier.student.student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atelier.student.student.Entity.Stage;
import atelier.student.student.Repository.StageRepository;

@Service
public class StageServiceImpl implements StageService {

    @Autowired
    private StageRepository stageRepository;

    @Override
    public Iterable<Stage> getAllStages() {
        return stageRepository.findAll();
    }

    @Override
    public Stage createStage(String titre, String description) {
        Stage newStage = new Stage(titre, description);
        return stageRepository.save(newStage);
    }

    @Override
    public Stage getStageById(Long id) {
        return stageRepository.findById(id).orElse(null);
    }
}
