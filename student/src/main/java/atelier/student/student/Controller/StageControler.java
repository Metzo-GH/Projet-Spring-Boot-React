package atelier.student.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import atelier.student.student.Entity.Stage;
import atelier.student.student.Service.StageService;

@RestController
@RequestMapping("/stages")
@CrossOrigin(origins = "http://localhost:3000")
public class StageControler {

    @Autowired
    private StageService stageService;

    @GetMapping
    public Iterable<Stage> getStages() {
        return stageService.getAllStages();
    }

    @GetMapping("/create")
    public Stage createStage(
            @RequestParam(value = "titre", defaultValue = "Unknown") String titre,
            @RequestParam(value = "description", defaultValue = "Unknown") String description) {
        return stageService.createStage(titre, description);
    }

    @GetMapping("/{id}")
    public Stage getStage(@PathVariable Long id) {
        return stageService.getStageById(id);
    }
}
