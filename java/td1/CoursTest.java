import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CoursTest {

    private Administrateur admin = new Administrateur();
    private Enseignant ens1 = new Enseignant();

    @Test
    public void test_creer_cours() {
        Cours c = admin.creerCours(ens1);
        assertNotNull(c);
    }

    @Test
    public void test_get_devoir() {
        Cours c = admin.creerCours(ens1);
        ens1.creerDevoir(c,"test");
        assertNotNull(c.getDevoir("test"));



    }
}
