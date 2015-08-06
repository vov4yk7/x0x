package io.x0x.model;

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
    public void testGetFigure() throws Exception {

    }

    @Test
    public void testSetFiure() throws Exception {

        final Field field = new Field();
        final Point inputPoin = new Point(0,0);
        final Figure inputFigure = Figure.O;

        field.setFiure(inputPoin,inputFigure);
        final Figure actualFigure = field.getFigure(inputPoin);
        assertEquals(inputFigure,actualFigure);

    }
}