package controller;

import model.Position;

import java.util.ArrayList;
import java.util.List;

import static controller.MovementController.move;

public class AppController {

    /**
     * Computes the steps. Stores new unique positions and count them.
     * @param directions
     * @return number of unique positions == number of captured pokemons
     */
    public int catchThemAll( char[] directions ) {

        Position currentPosition = new Position();

        List<Position> verifiedPositions = new ArrayList<>();
        verifiedPositions.add( currentPosition );

        for( char direction : directions ) {
            currentPosition = move( currentPosition, direction );

            if ( !verifiedPositions.contains( currentPosition ) ) {
                verifiedPositions.add( currentPosition );
            }
        }

        return verifiedPositions.size();
    }
}
