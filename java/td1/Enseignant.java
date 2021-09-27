
import java.util.*;

public class Enseignant extends Utilisateur {

    public Enseignant() {
    }

    private String Nunem;
    private String Harpege;

    public Devoir creerDevoir(Cours c, String nom) {
        return new Devoir(c,nom);
    }

    public void noter(Rendu r) {
        r.setPoints(1);
        r.setAvis("test");
    }

}