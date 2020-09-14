package com.anita;
import acm.graphics.*;
import acm.util.RandomGenerator;

import java.awt.*;

import static com.anita.EnvironmentConstants.*;

public class Main {

    private static GCanvas canvas = new GCanvas();
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private GameEnvironment gameEnvironment = GameEnvironment.getInstance();
    private double vx, vy;

    public static void main(String[] args) {
	    System.out.println("Hello, World!");
	    playGame();

    }

    private static void playGame() {
        for (int turn = 0; turn < NTURNS; turn++) {
            canvas.removeAll();
            setUpEnvironment();

        }
    }

    private static void setUpEnvironment() {
        // BRICKS
        drawEnvironment();
    }

    private static void drawEnvironment() {
        addBrickWall(x, y);
        // add paddle
        Ball ball = Ball.getInstance(x, y, radius, Color.BLACK);
        ball.add(canvas);
    }
}
