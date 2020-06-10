package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static common.Messages.*;
import static org.junit.Assert.assertEquals;
import static view.ConsoleView.showMessage;

public class MessagesEnTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream originalOutput = System.out;

    @Before
    public void before() {
        System.setOut( new PrintStream(output) );
    }

    @After
    public void after() {
        System.setOut(originalOutput);
    }

    @Test
    public void testHello() {
        showMessage( getString( HELLO_WELCOME ) );
        String text = "Hello and welcome to the Pokemon World!\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testInstructions() {
        showMessage( getString( INSTRUCTIONS ) );
        String text = "Your task today is to walk around and catch as many pokemons as possible. \n" +
                "And to do it you need to inform a sequence of movements, indicating the direction you want to go. \n" +
                "You can choose to go N (north), S (south), E (east) or W (west). \n" +
                "Each movement will take you into a new position and there you will find a pokemon to catch. \n" +
                "If the movements take you into a position you have already visited there will be no pokemons to catch. \n" +
                "So choose wisely your steps not to fall into the same spot twice. \n" +
                "Now go explore the world, catch as many pokemons you can and become a new Pokemon Master!\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testInforMoves() {
        showMessage( getString( INFORM_MOVES ) );
        String text = "Give your best shot and type in your list of movements. Type 0 to exit.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testCongratulations() {
        showMessage( getString( CONGRATULATIONS ) );
        String text = "Congratulations! You caught %s pokemons.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testRequestInput() {
        showMessage( getString( REQUEST_INPUT ) );
        String text = "Type in your sequence of directions: N (north), S (south), E (east) or W (west). Type 0 to exit.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testEmptyInput() {
        showMessage( getString( EMPTY_INPUT ) );
        String text = "The input cannot be empty.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testInvalidInput() {
        showMessage( getString( INVALID_INPUT ) );
        String text = "The input contains invalid values.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testTryAgain() {
        showMessage( getString( TRY_AGAIN ) );
        String text = "Try again!\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testExit() {
        showMessage( getString( EXIT ) );
        String text = "Program will shut down...\n";
        assertEquals(text, output.toString());
    }
}
