package main;

import controller.AppController;
import exception.InvalidInputException;

import static common.InputReader.readInput;
import static common.InputReader.validateInput;
import static view.ConsoleView.*;

public class Main {

    public static void main( String[] args ) {
        if( args.length > 0 )
            if( args[0].equalsIgnoreCase( "fun" )){
                tellTheStory();
                runStoryMode();
            }
            else
                runInputMode( args[0] );
        else
            runRequestInputMode();
    }

    /**
     * Prints in console a story explaining the game
     * Requests the user input (directions)
     * Outputs a congratulation message and the number of captured pokemons
     */
    private static void runStoryMode() {
        try {

            askForInput();

            char[] input = readInput();

            if( !isExit( input ) ) {
                int output = getOutput( input );

                showResult( output );
            }
        } catch ( InvalidInputException e ) {
            showMessage( e.getMessage() );
            showTryAgainMessage();

            runStoryMode();
        }
    }

    /**
     * Uses as input the argument passed for the program during initialization
     * Outputs only the result (number of captured pokemons)
     */
    private static void runInputMode( String arg ) {
        try {
            char[] input = new char[0];

            input = validateInput( arg );

            int output = getOutput( input );

            output( output );

        } catch (InvalidInputException e) {
            showMessage( e.getMessage() );
            showExitMessage();
        }
    }

    /**
     * Requests the user input (directions)
     * Outputs only the result (number of captured pokemons)
     */
    private static void runRequestInputMode() {
        try {
            requestInput();

            char[] input = readInput();

            if( !isExit( input ) ){
                int output = getOutput(input);

                output(output);
            }
        } catch ( InvalidInputException e ) {
            showMessage( e.getMessage() );
            showTryAgainMessage();

            runRequestInputMode();
        }
    }

    private static int getOutput( char[] input ) {
        AppController ash = new AppController();

        return ash.catchThemAll( input );
    }

    /**
     * Test for the exit command
     * @param input
     * @return
     */
    private static boolean isExit( char [] input ) {
        if ( input.length > 0 && input[0] == 0 ){
            showExitMessage();
            return true;
        }
        return false;
    }
}
