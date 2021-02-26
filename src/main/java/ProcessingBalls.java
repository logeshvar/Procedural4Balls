import processing.core.PApplet;

public class ProcessingBalls extends PApplet{
    public static final float diameter = 10;
    public static final int width = 640;
    public static final int height = 480;
    float p=0;
    float q=0;
    float r=0;
    float s=0;
    public static void main(String[] args){PApplet.main("ProcessingBalls",args);}
    @Override
    public void settings() {
        super.settings();

        size(width,height);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {

        ellipse(p, 96, diameter, diameter);
        p+=0.25;
    }
    private void drawCircle2() {

        ellipse(q, 192, diameter, diameter);
        q+=0.5;
    }
    private void drawCircle3() {

        ellipse(r, 288, diameter, diameter);
        r+=0.75;
    }
    private void drawCircle4() {

        ellipse(s, 384, diameter, diameter);
        s+=1;
    }


    private void paintWhite() {
        background(255);
    }
}
