package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static common.Messages.*;
import static org.junit.Assert.assertEquals;
import static view.ConsoleView.*;

public class ViewTest {

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
    public void testTellTheStory() {
        tellTheStory();
        String text = getString( HELLO_WELCOME ) + "\n\n"
                + getString( INSTRUCTIONS ) + "\n\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testAskForInput() {
        askForInput();
        String text = getString( INFORM_MOVES ) + "\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testRequestInput() {
        requestInput();
        String text = getString( REQUEST_INPUT ) + "\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testShowResult() {
        showResult( 10 );
        String text = formatString( CONGRATULATIONS, 10 ) + "\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testOutput() {
        output( 10 );
        String text = "10\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testShowMessage() {
        showMessage( "Test" );
        String text = "Test\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testShowTryAgainMessage() {
        showTryAgainMessage();
        String text = getString( TRY_AGAIN ) + "\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testShowExitMessage() {
        showExitMessage();
        String text = getString( EXIT ) + "\n";
        assertEquals(text, output.toString());
    }
}
