import processing.core.PApplet;

public class FourBalls extends PApplet
{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 25;
    public static final int SPACING = HEIGHT/5;
    int[] state = {0, 0, 0, 0};

    public static void main(String[] args)
    {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        for(int i = 1 ; i <= 4 ; i++)
        {
            ellipse(state[i-1],SPACING * i, DIAMETER,DIAMETER);
            state[i-1]+=i;
        }
    }
}


