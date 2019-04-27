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

    Button b;
    MovingCircle mc;
    Radar rad;
    Stars s;
    Cockpit c;
    Reticle ret;


    Stars[] stars = new Stars[600];
    float speed;  
    float sx;
    float sy;  
    
    int xspacing = 2;  
    int w;              

    float theta = 0;
    float amplitude = 30; 
    float period = 500; 
    float dx; 
    float[] yvalues; 


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
        //fullScreen();
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
        rad = new Radar(this,random(0, width), random(0, height),random(width/2),height/3,height/4,150,0);
        c = new Cockpit(this, random(0, width), random(0, height),random(width/2));
        ret = new Reticle(this,random(0, width), random(0, height),random(width/2),height/3,height/4,150,0);
        for (int i=0;i<stars.length;i++)
        {
            stars[i] = new Stars(this, random(0, width), random(0, height),random(width/2));
        }
      
       

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

