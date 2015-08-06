package io.x0x.model;

/**
 * Created by Vov4yk on 05.08.2015.
 */
public class Player {
    private final String name;
    private final Figure figure;

    public Player(final String name, final Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
