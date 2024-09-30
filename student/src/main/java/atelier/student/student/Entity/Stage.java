package atelier.student.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String description;

    protected Stage() {}

    public Stage(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Stage[id=%d, titre='%s', description='%s']",
                id, titre, description);
    }

    public Long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
