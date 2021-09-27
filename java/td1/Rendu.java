
import java.util.*;

/**
 * 
 */
public class Rendu {

    /**
     * Default constructor
     */
    public Rendu(Étudiant e) {
        this.auteur = e;
        this.etat = etatRendu.créé;
    }

    /**
     * 
     */
    private Étudiant auteur;

    /**
     * 
     */
    private float points;

    /**
     * 
     */
    private String avis;

    private String document;

    private etatRendu etat;




    /**
     * @param p
     */
    public void setPoints(int p) {
        points = p;
    }

    /**
     * @param a
     */
    public void setAvis(String a) {
        avis = a;
    }

    public etatRendu getEtat() { return etat; }

    public String getDocument() {
        return document;
    }

    public float getPoints() {
        return points;
    }

    public String getAvis() {
        return avis;
    }

    /**
     * 
     */
    public void uploadDocument(String d) {
        document = d;
        etat = etatRendu.uploadé;
    }

    public void affecter(Enseignant e) {
        e.noter(this);
        etat = etatRendu.affecté;
    }

    public void afficher() {
        System.out.println(document);
    }

}