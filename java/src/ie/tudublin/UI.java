package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    /**
     *
     */

    Button b;
    MovingCircle mc;
    Radar rad;
    Stars s;
    Cockpit c;

    Stars[] stars = new Stars[400];
    float speed;  
    float sx;
    float sy;  

    boolean[] keys = new boolean[1024];
	

    public void keyPressed() {
        keys[keyCode] = true;
    }

    public void keyReleased() {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c) {
        return keys[c] || keys[Character.toUpperCase(c)];
    }

    public void settings() {
        size(800, 800);
        
        // Use fullscreen instead of size to make your interface fullscreen
        // fullScreen();
    }
    
    public void setup() {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        rad = new Radar(this, width / 2, height / 2, 150);
        c = new Cockpit(this);
        for (int i=0;i<stars.length;i++)
        {
            stars[i] = new Stars(this, random(0, width), random(0, height),random(width/2));
        }
       // c = new Cockpit();
       

    }

    public void draw()
    {
        //map(mouseX, 0, width, 0, 50);
        
        background(0);
    
        //b.render();
    
        pushMatrix();
        translate(width/2, height/2);
        for(int i=0;i<stars.length;i++){
            stars[i].render();
            stars[i].update();
        }
        popMatrix();
   
        c.render();

        rad.render();
       rad.update();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

