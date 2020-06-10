package test;

import controller.AppController;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    private AppController ash;

    @Before
    public void before() {
        ash = new AppController();
    }

    @Test
    public void testInput1() {
        char [] input = "E".toCharArray();
        int pokemons = ash.catchThemAll( input );

        assertEquals(2, pokemons);
    }

    @Test
    public void testInput2() {
        char [] input = "NESO".toCharArray();
        int pokemons = ash.catchThemAll( input );

        assertEquals(4, pokemons);
    }

    @Test
    public void testInput3() {
        char [] input = "NSNSNSNSNS".toCharArray();
        int pokemons = ash.catchThemAll( input );

        assertEquals(2, pokemons);
    }

    @Test
    public void testBlankInput() {
        // Blank input means no move
        char [] input = " ".toCharArray();
        int pokemons = ash.catchThemAll( input );

        assertEquals(1, pokemons);
    }

    @Test
    public void testInputWithOneRepetition() {
        char [] input = "NESWWSE".toCharArray();
        int pokemons = ash.catchThemAll( input );

        assertEquals(7, pokemons);
    }

    @Test
    public void testLongInput() {
        char [] input = "NESWNNESNNWEEESSWNESSW".toCharArray();
        int pokemons = ash.catchThemAll( input );

        assertEquals(16, pokemons);
    }
}
