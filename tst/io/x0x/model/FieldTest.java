package io.x0x.model;

import io.x0x.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Vov4yk on 05.08.2015.
 */
public class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        final Field field = new Field();
        assertEquals(3, field.getSize());
    }

    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field();
        final Point inputPoin = new Point(0,0);

        final Figure actualFigure = field.getFigure(inputPoin);
        assertEquals(null,actualFigure);
    }

    @Test
    public void testGetFigureWhenXIsLessThenTherro() throws Exception {
        final Field field = new Field();
        final Point inputPoin = new Point(field.getSize()+1,0);

        try {
            field.getFigure(inputPoin);
            fail();
        }catch (final InvalidPointException e){}
    }

    @Test
    public void testGetFigureWhenYIsLessThenTherro() throws Exception {
        final Field field = new Field();
        final Point inputPoin = new Point(field.getSize()+1,0);

        try {
            field.getFigure(inputPoin);
            fail();
        }catch (final InvalidPointException e){}
    }

    @Test
    public void testSetFigure() throws Exception {

        final Field field = new Field();
        final Point inputPoin = new Point(0,0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoin, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoin);
        assertEquals(inputFigure,actualFigure);

    }
}