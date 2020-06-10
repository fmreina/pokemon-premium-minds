package test;

import exception.InvalidInputException;
import org.junit.Test;

import static common.InputReader.validateInput;
import static org.junit.Assert.assertArrayEquals;

public class InputTest {

    @Test
    public void testUpperCaseInput() throws InvalidInputException {
        char [] input = validateInput("NSLEOW");
        char [] expected = new char [] { 'N', 'S', 'E', 'E', 'W', 'W' };

        assertArrayEquals(expected, input);
    }

    @Test
    public void testLowerCaseInput() throws InvalidInputException {
        char [] input = validateInput("nsleow");
        char [] expected = new char [] { 'N', 'S', 'E', 'E', 'W', 'W' };

        assertArrayEquals(expected, input);
    }

    @Test
    public void testInputWithWhiteSpace() throws InvalidInputException {
        char [] input = validateInput("N S L  E O W");
        char [] expected = new char [] { 'N', 'S', 'E', 'E', 'W', 'W' };

        assertArrayEquals(expected, input);
    }

    @Test( expected = InvalidInputException.class)
    public void testInvalidInput() throws InvalidInputException {
        validateInput("NSLAEOW");
    }

    @Test( expected = InvalidInputException.class)
    public void testEmptyInput() throws InvalidInputException {
        validateInput("");
    }

    // OPTIONAL: Uncomment this test in case of @InputReader.validateInput() prevents blank spaces.
    //@Test( expected = InvalidInputException.class)
    //public void testBlankInput() throws InvalidInputException {
    //    validateInput(" ");
    //}
}
