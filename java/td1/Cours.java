import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Cours {

    private Enseignant ens;
    private String nom;
    private List<Devoir> devoirs = new ArrayList<>();

    public Cours(Enseignant e) {
        this.ens = e;
    }

    public void ajouterDevoir(Devoir d) {
        this.devoirs.add(d);
    }
    public Devoir getDevoir(String nom) {
        for (Devoir devoir : devoirs) {
            if (devoir.getNom().equals(nom)) return devoir;
        }
        return devoirs.get(0);
    }

    public void afficher() {
        System.out.println(nom);
    }


}