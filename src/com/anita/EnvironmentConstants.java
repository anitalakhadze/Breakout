package com.anita;

public class EnvironmentConstants {

    /** Width and height of application window in pixels */
    protected static final int APPLICATION_WIDTH = 400;
    protected static final int APPLICATION_HEIGHT = 600;

    /** Dimensions of game board (usually the same) */
    protected static final int WIDTH = APPLICATION_WIDTH;
    protected static final int HEIGHT = APPLICATION_HEIGHT;

    /** Dimensions of the paddle */
    protected static final int PADDLE_WIDTH = 60;
    protected static final int PADDLE_HEIGHT = 10;

    /** Offset of the paddle up from the bottom */
    protected static final int PADDLE_Y_OFFSET = 30;

    /** Number of bricks per row */
    protected static final int NBRICKS_PER_ROW = 10;

    /** Number of rows of bricks */
    protected static final int NBRICK_ROWS = 10;

    /** Separation between bricks */
    protected static final int BRICK_SEP = 4;

    /** Width of a brick */
    protected static final int BRICK_WIDTH =
            (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

    /** Height of a brick */
    protected static final int BRICK_HEIGHT = 8;

    /** Radius of the ball in pixels */
    protected static final int BALL_RADIUS = 10;

    /** Offset of the top brick row from the top */
    protected static final int BRICK_Y_OFFSET = 70;

    /** Number of turns */
    protected static final int NTURNS = 3;
}
