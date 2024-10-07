package atelier.student.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atelier.student.student.Entity.Stage;
import atelier.student.student.Repository.StageRepository;


@RestController
@RequestMapping("/stages")
public class StageControler {

    @Autowired
    private StageRepository stageRepository;
    
    @GetMapping
    public Iterable<Stage> getStages() {
        return stageRepository.findAll();
    }

    @GetMapping("/add")
    public Iterable<Stage> getAllStages() {
        stageRepository.save(new Stage("DevOps", "Google"));
        stageRepository.save(new Stage("MOA", "Facebook"));
        stageRepository.save(new Stage("Ingénieur", "WhatsApp"));
        return stageRepository.findAll();
    }

    @GetMapping("/create")
    public Stage createStage(
        @RequestParam(value = "titre", defaultValue = "Unknown") String titre,
        @RequestParam(value = "description", defaultValue = "Unknown") String description
    ) {
        Stage newStage = new Stage(titre, description);
        return stageRepository.save(newStage);
    }
}
