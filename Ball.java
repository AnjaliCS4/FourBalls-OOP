import processing.core.PApplet;

public class Ball {
    public static final int DIAMETER = 25;
    private int x;
    private int y;
    private int speed;

    public Ball(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void move() {
        x += speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(x, y, DIAMETER, DIAMETER);
    }
}
