import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {

        // Utilisateurs
        Administrateur a = new Administrateur();
        Enseignant e1 = new Enseignant();
        Enseignant e2 = new Enseignant();
        Étudiant ed1 = new Étudiant();
        Étudiant ed2 = new Étudiant();

        Cours c = a.creerCours(e1);
        Devoir d1 = e1.creerDevoir(c, "dev1");
        Devoir d2 = e1.creerDevoir(c, "dev2");

        d1.afficher();

    }
}