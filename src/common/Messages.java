package common;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import static java.lang.String.format;
import static java.util.ResourceBundle.getBundle;

public class Messages {

    private static final String BUNDLE_NAME = "resources.messages";

    private static final Locale LOCALE_EN = new Locale("en", "US" );

    private static final Locale LOCALE_PT = new Locale("pt", "PT" );

    private static ResourceBundle RESOURCE_BUNDLE = getBundle( Messages.BUNDLE_NAME,  Locale.getDefault() );

    /**
     * Sets the bundle to show messages in english or portuguese
     * @param language : en / pt
     */
    public static void setLocale( String language ) {
       if( language == "pt" )
           RESOURCE_BUNDLE = getBundle( Messages.BUNDLE_NAME, LOCALE_PT );
        if( language == "pt" )
            RESOURCE_BUNDLE = getBundle( Messages.BUNDLE_NAME, LOCALE_EN );
    }

    /**
     * Gets the message from messages.properties
     * @param key
     * @return message
     */
    public static String getString( String key ) {
        try {
            return RESOURCE_BUNDLE.getString( key );
        } catch( MissingResourceException e ) {
            return "!" + key + "!";
        }
    }

    /**
     * Formats the string to use parameterized arguments
     * @param key
     * @param args
     * @return message
     */
    public static String formatString(String key, Object ... args ) {
       return format( getString( key ), args );
    }

    public static final String HELLO_WELCOME = "HELLO_WELCOME";

    public static final String INSTRUCTIONS = "INSTRUCTIONS";

    public static final String INFORM_MOVES = "INFORM_MOVES";

    public static final String CONGRATULATIONS = "CONGRATULATIONS";

    public static final String REQUEST_INPUT = "REQUEST_INPUT";

    public static final String EMPTY_INPUT = "EMPTY_INPUT";

    public static final String INVALID_INPUT = "INVALID_INPUT";

    public static final String TRY_AGAIN = "TRY_AGAIN";

    public static final String EXIT = "EXIT";
}
