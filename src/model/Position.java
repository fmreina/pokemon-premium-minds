package model;

import static java.lang.String.format;

public class Position {

    private int coordinateX;
    private int coordinateY;

    public Position(){
        this.coordinateX = 0;
        this.coordinateY = 0;
    }

    public Position( int coordinateX, int coordinateY ){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void moveNorth(){
        this.coordinateY++;
    }

    public void moveSouth(){
        this.coordinateY--;
    }

    public void moveEast(){
        this.coordinateX++;
    }

    public void moveWest(){
        this.coordinateX--;
    }

    public int coordinateX(){
        return this.coordinateX;
    }

    public int coordinateY(){
        return this.coordinateY;
    }

    @Override
    public boolean equals( Object o ) {
        Position position = ( Position ) o ;
        if( this.coordinateX == position.coordinateX ){
            if( this.coordinateY == position.coordinateY ){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return format( "(%d,%d)", coordinateX, coordinateY );
    }
}
