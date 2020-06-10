package common;

import exception.InvalidInputException;

import java.util.Scanner;

import static common.Messages.*;

public class InputReader {

    private static Scanner in = new Scanner( System.in );
    private static final String VALID_INPUTS = "NSELWO";

    /**
     * Reads the user input from Scanner
     * @return validateInput()
     * @throws InvalidInputException
     */
    public static char [] readInput() throws InvalidInputException {
        String input = in.nextLine();

        if( input.equals("0"))
            return new char [] { 0 };

        return validateInput( input );
    }

    /**
     * Verifies the user input and accepts only N, S, L, E, O, W.
     * Translates L ("leste") to E (east) and O ("oeste") to W ("west")
     * @param userInput
     * @return input, traslated to English, with no blank spaces, in upper case
     * @throws InvalidInputException
     */
    public static char [] validateInput( String userInput ) throws InvalidInputException {
        // OPTIONAL: add < || userInput.equals( " " ) > to the following condition to force at least one move. Remember to uncomment the test on InputTest.
        if( userInput.isEmpty() )
            throw new InvalidInputException( getString( EMPTY_INPUT ) );

        char [] input = userInput.toUpperCase()
                .replace(" ", "" )
                .replace("L","E" ) // convert "Leste" to "East"
                .replace("O", "W" ) // convert "Oeste" to "West"
                .toCharArray();

        for ( char c : input ) {
            if ( VALID_INPUTS.indexOf( c ) == -1 )
                throw new InvalidInputException( getString( INVALID_INPUT ) );
        }

        return input;
    }
}
