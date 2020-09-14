package com.anita;

import acm.graphics.GCanvas;
import acm.graphics.GObject;
import acm.graphics.GOval;

public class GameEnvironment {

    private static GameEnvironment gameEnvironment = null;
    private GCanvas canvas;
    private Ball ball;
    private Paddle paddle;
    private BrickWall brickWall;

    public static GameEnvironment getInstance() {
        if (gameEnvironment == null) gameEnvironment = new GameEnvironment();
        return gameEnvironment;
    }

    private GameEnvironment() {
        canvas = new GCanvas();
        ball = Ball.getInstance();
        paddle = Paddle.getInstance();
        brickWall = new BrickWall(canvas);
    }

    private void checkForCollisions() {
        GObject collider = getCollidingObject();
        if (collider == paddle) {

        }
    }
}
