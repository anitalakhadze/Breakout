package com.anita;
import acm.graphics.GCanvas;
import acm.graphics.GRect;

import java.awt.*;
import java.util.Random;

import static com.anita.EnvironmentConstants.*;


public class BrickWall {

    private GCanvas canvas;
    Random rand;

    public BrickWall (GCanvas canvas) {
        this.canvas = canvas;
        rand = new Random();
        buildWall();
    }

    private void buildWall() {
        for (int row = 0; row < NBRICK_ROWS; row++) {
            for (int i = 0; i < NBRICKS_PER_ROW; i++) {
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color color = new Color(r, g, b);
                Brick brick = new Brick(BRICK_SEP + i * (BRICK_WIDTH + BRICK_SEP),
                        BRICK_Y_OFFSET + (BRICK_SEP + BRICK_HEIGHT) * row, color, canvas);
            }

        }
    }


}
