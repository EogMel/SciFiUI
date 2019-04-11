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
    Reticle ret;
 

    Stars[] stars = new Stars[800];
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
        size(800 , 800);
   
        // Use fullscreen instead of size to make your interface fullscreen
        // fullScreen();
    }
    
    public void setup() {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        rad = new Radar(this, width / 2, height / 2, 150);
        c = new Cockpit(this);
        ret = new Reticle(this);
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
            stars[i].update();
            stars[i].render();
            
        }
        popMatrix();
   
        ret.render();
        ret.update();
        c.render();
        stroke(255);

        rad.render();
       rad.update();


        

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

