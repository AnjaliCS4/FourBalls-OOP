import processing.core.PApplet;

import java.util.ArrayList;


public class FourBallsOOP extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    int StartPos = 0;
    int Spacing = HEIGHT / 5;
    ArrayList<Ball> ballList = new ArrayList<>();

    public static void main(String args[]) {
        PApplet.main("FourBallsOOP", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 1; i <= 4; i++) {
            int speed = i;
            ballList.add(new Ball(StartPos, Spacing * i, speed));
        }
    }

    @Override
    public void draw() {
        for (Ball ball : ballList) {
            ball.move();
            ball.draw(this);
        }
    }
