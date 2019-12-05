package miage.shu.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeuTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testJeuEstValide() {
        //given : un jeu valide
        assertTrue(new Jeu(1,4).isValid());
        assertTrue(new Jeu(10).isValid());
        assertTrue(new Jeu(6,4).isValid());
    }

    @Test
    public void testJeuEstNonValide() {
        //given : un jeu non valide
        assertFalse(new Jeu(null, 2).isValid());
        assertFalse(new Jeu(null).isValid());
        assertFalse(new Jeu(3).isValid());
        assertFalse(new Jeu(3, null).isValid());
        assertFalse(new Jeu(5,6).isValid());
    }
}