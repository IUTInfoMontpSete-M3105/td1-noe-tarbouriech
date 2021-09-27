
import java.util.*;

/**
 * 
 */
public class Devoir {

    public Devoir(Cours c, String nom) {
        this.nom = nom;
        c.ajouterDevoir(this);
    }

    private String nom;
    private String description;
    private Date deadline;
    private float points;

    public void afficher() {
        System.out.println("nom:" + nom);
        System.out.println("description:" + description);
        System.out.println("deadline:" + deadline);
        System.out.println("points:" + points);
    }

    public void setPoints(float pts) {
        points = pts;
    }

    public void setDescription(String d) {
        description = d;
    }

    public void setDeadline(Date d) {
        deadline = d;
    }

    public float getPoints() {
        return points;
    }

    public String getNom() {
        return nom;
    }

}