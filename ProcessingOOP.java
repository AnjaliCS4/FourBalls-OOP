import processing.core.PApplet;
import java.util.ArrayList;

class Ball{
    public static final int DIAMETER = 25;
    private int x;
    private int y;
    private int speed;

    Ball(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
    public void move()
    {
        x+=speed;
    }

    public void draw(PApplet pApplet)
    {
        pApplet.ellipse(x,y,DIAMETER, DIAMETER);
    }
}
public class ProcessingOOP extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    int StartPos = 0;
    int Spacing = HEIGHT/5;
    ArrayList<Ball>list = new ArrayList<>();

    public static void main (String args[]) {
        PApplet.main("ProcessingOOP",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for(int i=1 ; i<=4 ; i++) {
            list.add(new Ball(StartPos,Spacing*i,i));
        }
    }

    @Override
    public void draw() {
        for(Ball ball : list) {
            ball.move();
            ball.draw(this);
        }
    }
}
