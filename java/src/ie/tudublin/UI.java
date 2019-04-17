package ie.tudublin;


import processing.core.PApplet;
import ddf.minim.*;




public class UI extends PApplet
{
    Minim minim;
    
    AudioPlayer player;
    AudioPlayer player1;
    AudioPlayer player2;
    AudioPlayer player3;
    AudioPlayer player4;
    /**
     * 
     *
     */



    Button b;
    MovingCircle mc;
    Radar rad;
    Stars s;
    Cockpit c;
    Reticle ret;


    Stars[] stars = new Stars[500];
    float speed;  
    float sx;
    float sy;  
    
    int xspacing = 2;   // How far apart should each horizontal location be spaced
    int w;              // Width of entire wave

    float theta = 0;  // Start angle at 0
    float amplitude = 30;  // Height of wave
    float period = 500;  // How many pixels before the wave repeats
    float dx;  // Value for incrementing X, a function of period and xspacing
    float[] yvalues; // Using an array to store height values for the wave


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
        minim = new Minim(this);
        player = minim.loadFile("Rocket Thrusters-SoundBible.com-1432176431.mp3");
        player1 = minim.loadFile("creepy-background-daniel_simon.mp3");
        player2 = minim.loadFile("164102__bmaczero__laser.wav");
        player3 = minim.loadFile("336740__steshystesh__spaceship-whoosh-1.wav");
        player4 = minim.loadFile("hyper.wav");
        
        w = width/4;
        dx = (UI.TWO_PI / period) * xspacing*2;
        yvalues = new float[w/xspacing];


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
    
         
        if(player.position() == player.length())
        {
            player.rewind();
            player.play();
        }
        else{
            player.play();
        }
        if(player1.position() == player1.length())
        {
            player1.rewind();
            player1.play();
        }
        else{
            player1.play();
        }
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
        c.calcWave();
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

