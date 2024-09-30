package atelier.student.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String prenom;
    private String nom;

    protected Student() {}

    public Student(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%d, prenom='%s', nom='%s']",
                id, prenom, nom);
    }

    public Long getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
