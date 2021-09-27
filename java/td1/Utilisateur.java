
import java.util.*;

/**
 * 
 */
public class Utilisateur {

    /**
     * Default constructor
     */
    public Utilisateur() {
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String prenom;

    /**
     * 
     */
    private String adresse;

    /**
     * 
     */
    private String mail;

    /**
     * 
     */
    public void gererDonnees() {
        // TODO implement here
    }

    /**
     * @param c
     */
    public void afficherCours(Cours c) {
        // TODO implement here
        c.afficher();
    }

    /**
     * @param d
     */
    public void afficherDevoirs(Devoir d) {
        d.afficher();
    }

    /**
     * @param r
     */
    public void afficherRendu(Rendu r) {
        r.afficher();
    }

}