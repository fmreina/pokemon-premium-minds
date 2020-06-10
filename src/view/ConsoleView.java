package view;

import static common.Messages.*;
import static java.lang.System.out;

public class ConsoleView {

    public static void tellTheStory() {
        out.println( getString( HELLO_WELCOME ) + "\n" );
        out.println( getString(( INSTRUCTIONS )) + "\n" );
    }

    public static void askForInput() {
        out.println( getString( INFORM_MOVES ) );
    }

    public static void requestInput() {
        out.println( getString( REQUEST_INPUT ) );
    }

    public static void showResult( int pokemons ){
        out.println(formatString( CONGRATULATIONS, pokemons ));
    }

    public static void output( int pokemons ){
        out.println( pokemons );
    }

    public static void showMessage(String message ) {
        out.println( message );
    }

    public static void showTryAgainMessage() {
        out.println( getString( TRY_AGAIN ) );
    }

    public static void showExitMessage()  {
        out.println( getString( EXIT ) );
    }
}
