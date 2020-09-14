package com.anita;
import acm.graphics.GRect;
import static com.anita.EnvironmentConstants.*;
import java.awt.*;

public class Paddle {

    private static Paddle paddle = null;
    private GRect rect;
    private double x, y, width, height;
    private Color color;

    public static Paddle getInstance() {
        if (paddle == null) paddle = new Paddle();
        return paddle;
    }

    private Paddle() {
        this.x = (WIDTH - PADDLE_WIDTH) / 2.0;
        this.y = APPLICATION_HEIGHT - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
        this.width = PADDLE_WIDTH;
        this.height = PADDLE_HEIGHT;
        rect = new GRect(this.x, this.y, width, height);
        rect.setFilled(true);
        rect.setFillColor(Color.BLACK);
    }
}
