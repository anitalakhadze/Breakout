package com.anita;
import static com.anita.EnvironmentConstants.*;

import acm.graphics.GCanvas;
import acm.graphics.GRect;

import java.awt.*;

public class Brick {

    private GRect brick;
    private double x, y, width, height;
    private Color color;

    public Brick(double x, double y, Color color, GCanvas canvas) {
        this.x = x;
        this.y = y;
        this.width = BRICK_WIDTH;
        this.height = BRICK_HEIGHT;
        GRect brick = new GRect(this.x, this.y, width, height);
        brick.setFilled(true);
        brick.setFillColor(color);
        canvas.add(brick);
    }
}
