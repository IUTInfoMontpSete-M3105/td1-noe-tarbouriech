import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RenduTest {

    private Administrateur admin = new Administrateur();
    private Étudiant et = new Étudiant();
    private Enseignant ens1 = new Enseignant();

    @Test
    public void test_creer_rendu() {
        Cours c = admin.creerCours(ens1);
        Devoir d = ens1.creerDevoir(c, "test");
        Rendu r = new Rendu(et);
        assertSame(r.getEtat(), etatRendu.créé);
    }

    @Test
    public void test_upload() {
        Rendu r = new Rendu(et);
        r.uploadDocument("document");
        assertNotNull(r.getDocument());
        assertSame(r.getEtat(), etatRendu.uploadé);
    }

    @Test
    public void test_affecter() {
        Rendu r = new Rendu(et);
        r.affecter(ens1);
        assertSame(r.getEtat(),etatRendu.affecté);
    }

    @Test
    public void saisir_note() {
        Rendu r = new Rendu(et);
        r.uploadDocument("document");
        r.setPoints(18);
        assertEquals(r.getPoints(),18);
    }

    @Test
    public void saisir_avis() {
        Rendu r = new Rendu(et);
        r.uploadDocument("document");
        r.setPoints(18);
        assertEquals(r.getPoints(),18);
    }
}
