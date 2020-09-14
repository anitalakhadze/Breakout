package com.anita;
import acm.graphics.*;

import java.awt.*;
import static com.anita.EnvironmentConstants.*;

public class Ball {

    private static Ball ball = null;
    private GOval oval;
    private double x, y, width, height;

    public static Ball getInstance () {
        if (ball == null) ball = new Ball();
        return ball;
    }

    private Ball() {
        this.x = WIDTH / 2.0 - BALL_RADIUS;
        this.y = HEIGHT / 2.0 - BALL_RADIUS;
        this.width = BALL_RADIUS * 2;
        this.height = BALL_RADIUS * 2;
        oval = new GOval(this.x, this.y, width, height);
        oval.setFilled(true);
        oval.setFillColor(Color.BLACK);
    }

    public void add (GCanvas canvas) {
        ball.add(canvas);
    }


}
