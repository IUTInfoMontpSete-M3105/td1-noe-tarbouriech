/**
 * 
 */
public class Administrateur extends Utilisateur {


    public Administrateur() {
    }

    public Cours creerCours(Enseignant e) {
        return new Cours(e);
    }

    public void supprimerCours(Cours c) {
        c = null;
    }

}