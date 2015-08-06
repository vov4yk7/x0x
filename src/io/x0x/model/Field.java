package io.x0x.model;

import io.x0x.model.exceptions.InvalidePointException;
import sun.plugin2.gluegen.runtime.CPU;

import java.awt.*;


public class Field {
    private  static final int FIELD_SIZE = 3;
    private  static final int MIN_COORDINATE = 0;
    private  static final int MAX_COORDINATE = FIELD_SIZE;

    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize(){
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidePointException{
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }
        return field[point.x][point.y];
    }

    public void setFiure(final Point point, final Figure figure) throws InvalidePointException{
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point){
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate){
        return  coordinate>=MIN_COORDINATE && coordinate<=MAX_COORDINATE;
    }
}
