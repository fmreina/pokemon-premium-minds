package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static common.Messages.*;
import static org.junit.Assert.assertEquals;
import static view.ConsoleView.showMessage;

public class MessagesPtTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream originalOutput = System.out;
    private final Locale originalLocale = Locale.getDefault();

    @Before
    public void before() {
        System.setOut( new PrintStream(output) );
        Locale.setDefault( new Locale("pt", "PT" ) );
        setLocale( "pt" );
    }

    @After
    public void after() {
        System.setOut( originalOutput );
        Locale.setDefault( originalLocale );
    }

    @Test
    public void testHello() {
        showMessage( getString( HELLO_WELCOME ) );
        String text = "Olá e bem vindo ao Mundo Pokémon!\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testInstructions() {
        showMessage( getString( INSTRUCTIONS ) );
        String text = "Sua tarefa hoje é caminhar por aí e apanhar o máximo de pokémons possível. \n" +
                "E para fazer isso, é necessário informar uma sequência de movimentos, indicando a direção que você deseja seguir. \n" +
                "Você pode optar por ir ao N (norte), S (sul), E (este) ou O (oeste). \n" +
                "Cada movimento o levará para uma nova posição e você encontrará um pokémon para capturar. \n" +
                "Se os movimentos o levarem a uma posição que você já visitou, não haverá pokémons para capturar. \n" +
                "Portanto, escolha sabiamente seus passos para não passar pelo mesmo local duas vezes. \n" +
                "Agora vá explorar o mundo, apanhe o máximo de pokémons possível e torne-se um novo Mestre Pokémon!\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testInforMoves() {
        showMessage( getString( INFORM_MOVES ) );
        String text = "Faça sua melhor aposta e digite sua lista de direções! Digite 0 para sair.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testCongratulations() {
        showMessage( getString( CONGRATULATIONS ) );
        String text = "Parabéns! Você conseguiu apanhar %s pokémons.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testRequestInput() {
        showMessage( getString( REQUEST_INPUT ) );
        String text = "Informe sua sequência de direções : N (norte), S (sul), E (este) ou O (oeste). Digite 0 para sair.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testEmptyInput() {
        showMessage( getString( EMPTY_INPUT ) );
        String text = "A sequência de entrada não pode ser vazia.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testInvalidInput() {
        showMessage( getString( INVALID_INPUT ) );
        String text = "A sequência de entrada contém valores inválidos.\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testTryAgain() {
        showMessage( getString( TRY_AGAIN ) );
        String text = "Tente outra vez!\n";
        assertEquals(text, output.toString());
    }

    @Test
    public void testExit() {
        showMessage( getString( EXIT ) );
        String text = "O programa encerrará...\n";
        assertEquals(text, output.toString());
    }
}
