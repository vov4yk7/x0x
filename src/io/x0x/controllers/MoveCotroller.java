package io.x0x.controllers;

import io.x0x.model.Field;
import io.x0x.model.Figure;
import io.x0x.model.exceptions.AlreadyOccupiedException;
import io.x0x.model.exceptions.InvalidPointException;

import java.awt.*;


public class MoveCotroller {
    public void applyFigure(final Point point, final Field field, final Figure figure) throws InvalidPointException, AlreadyOccupiedException{
        if (field.getFigure(point)!=null){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point,figure);
    }
}
