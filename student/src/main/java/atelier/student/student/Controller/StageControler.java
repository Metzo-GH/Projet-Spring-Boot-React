package atelier.student.student.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atelier.student.student.Entity.Stage;

@RestController
@RequestMapping("/stages")
public class StageControler {

    @GetMapping
    public List<Stage> getAllStages() {
        List<Stage> stages = new ArrayList<>();
        stages.add(new Stage("DevOps", "1 ans"));
        stages.add(new Stage("MOA", "6 mois"));
        stages.add(new Stage("MOE", "3 mois"));
        return stages;
    }
}
