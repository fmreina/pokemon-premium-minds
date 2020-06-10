package test;

import model.Position;
import org.junit.Before;
import org.junit.Test;

import static controller.MovementController.move;
import static org.junit.Assert.assertEquals;

public class MovementTest {

    private Position position;

    @Before
    public void before() {
        position = new Position(0, 0);
    }

    @Test
    public void testMoveNorth() {
        position = move(position, 'N');

        assertEquals("(0,1)", position.toString());
    }

    @Test
    public void testMoveSouth() {
        position = move(position, 'S');

        assertEquals("(0,-1)", position.toString());
    }

    @Test
    public void testMoveEast() {
        position = move(position, 'E');

        assertEquals("(1,0)", position.toString());
    }

    @Test
    public void testMoveWest() {
        position = move(position, 'W');

        assertEquals("(-1,0)", position.toString());
    }
}
