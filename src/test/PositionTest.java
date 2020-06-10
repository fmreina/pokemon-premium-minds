package test;

import model.Position;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PositionTest {

    private Position positionA;
    private Position positionB;
    private Position positionC;

    @Before
    public void before() {
        positionA = new Position(2,4);
        positionB = new Position(2,4);
        positionC = new Position(4,2);
    }

    @Test
    public void testEquality() {
        assertEquals(positionA, positionB);
    }

    @Test
    public void testDiference() {
      assertNotEquals(positionA, positionC);
    }

    @Test
    public void testPrint() {
      assertEquals("(4,2)", positionC.toString());
    }
}
