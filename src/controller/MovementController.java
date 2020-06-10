package controller;

import model.Position;

public class MovementController {

    /**
     * Identifies the direction and calls the move function
     * @param current
     * @param direction
     * @return the new Position
     */
    public static Position move( Position current, char direction ) {
        Position newPosition = new Position( current.coordinateX(), current.coordinateY() );

        switch ( direction ) {
            case 'N':
                newPosition.moveNorth();
                break;
            case 'S':
                newPosition.moveSouth();
                break;
            case 'E':
                newPosition.moveEast();
                break;
            case 'W':
                newPosition.moveWest();
                break;
        }

        return newPosition;
    }
}
