package ie.tudublin;



public class Cockpit {

    private UI ui;

    


    public Cockpit(UI ui) {
        this.ui = ui;
    }
    public void calcWave() {
        // Increment theta (try different values for 'angular velocity' here
        ui.theta += 0.02;
      
        // For every x value, calculate a y value with sine function
        float x = ui.theta;
        for (int i = 0; i < ui.yvalues.length; i++) {
          ui.yvalues[i] = ui.sin(x)*ui.amplitude;
          x+=ui.dx;
        }
      }

    public void render() {
        float third = ui.height/3;
        float quart = ui.height/4;
        float midDash = ui.height-third;
        
        ui.strokeWeight(5);
        ui.fill(73, 73, 73);
        ui.stroke(33);
        ui.rect(quart+20,ui.height- quart-50, 70, 50);
        ui.rect(quart + 37, ui.height-quart-75, 35, 25);

        ui.rect(quart+40+ third,ui.height- quart-50, 70, 50);
        ui.rect(quart + 57 + third, ui.height-quart-75, 35, 25);
        
        
        
        ui.stroke(100);
        ui.strokeWeight(5);

        ui.fill(125, 125, 137);
        
        ui.beginShape(); // necessary for filling in the dashboard
        ui.vertex(0, ui.height-third);
        ui.vertex(quart,ui.height-quart);
        ui.vertex(ui.width-quart,ui.height-quart);
        ui.vertex(ui.width, ui.height-third);
        ui.vertex(ui.width, ui.height);
        ui.vertex(0, ui.height);
        ui.vertex(0, ui.height-third);
        ui.endShape();



        ui.stroke(100);
        ui.beginShape();
        ui.vertex(0, quart);
        ui.vertex(quart, third/2);
        ui.vertex(ui.width-quart, third/2);
        ui.vertex(ui.width,quart);
        ui.vertex(ui.width,0);
        ui.vertex(0, 0);
        ui.vertex(0, quart);
        ui.endShape();

        // ui.fill(73, 73, 73);
        // ui.stroke(33);
        // ui.rect(quart+20,ui.height- quart-50, 70, 50);
        // ui.rect(quart + 37, ui.height-quart-75, 35, 25);

        // ui.rect(quart+40+ third,ui.height- quart-50, 70, 50);
        // ui.rect(quart + 57 + third, ui.height-quart-75, 35, 25);



        

        ui.stroke(80);
        ui.line(quart,ui.height, quart , ui.height - quart);
        ui.line(ui.width-quart, ui.height, ui.width-quart, ui.height-quart);
        ui.line(quart,0, quart , third/2);
        ui.line(ui.width-quart,0, ui.width- quart , third/2);





        ui.fill(89, 18, 0);
        ui.triangle(quart/2, ui.height-quart, quart/4+10, ui.height-quart+50, quart/2+quart/4-10, ui.height-quart+50);
        ui.triangle(quart/2, ui.height-20, quart/4+10, ui.height-70, quart/2+quart/4-10, ui.height-70);
        float midTriX = (quart/4+10)+60;
        float midTriY = (ui.height-quart) + 90;
        ui.triangle(20,  midTriY, midTriX-37, midTriY+25, midTriX-37, midTriY-25);
        ui.triangle(177,  midTriY, midTriX-5, midTriY+25, midTriX-5, midTriY-25);

        float gap = 20;
        float bHeight = 40;
        float bUp = gap + bHeight;

        ui.fill(153, 150, 3);
        ui.rect(quart + 20, ui.height-60, 80, bHeight);
        ui.fill(163, 95, 0);
        ui.rect(quart + 20, (ui.height-60) - bUp, 80, bHeight);
        ui.fill(8, 165, 50);
        ui.rect(quart + 20, ((ui.height-60) - bUp)-bUp, 80, bHeight);

        //BUTTON LIGHTS
        if (ui.checkKey('w') )
        {
            ui.fill(255,0,0);
            ui.triangle(quart/2, ui.height-quart, quart/4+10, ui.height-quart+50, quart/2+quart/4-10, ui.height-quart+50);
            
        }
        if (ui.checkKey('s') )
        {
            ui.fill(255,0,0);
            ui.triangle(quart/2, ui.height-20, quart/4+10, ui.height-70, quart/2+quart/4-10, ui.height-70);
            
        }

        if (ui.checkKey('a') )
        {
            ui.fill(255,0,0);
            ui.triangle(20,  midTriY, midTriX-37, midTriY+25, midTriX-37, midTriY-25);
            
        }

        if (ui.checkKey('d') )
        {
            ui.fill(255,0,0);
            ui.triangle(177,  midTriY, midTriX-5, midTriY+25, midTriX-5, midTriY-25);
            
        }

        if (ui.checkKey('f') )
        {
            ui.fill(255, 148, 0);
            ui.rect(quart + 20, (ui.height-60) - bUp, 80, bHeight);
            
        }
        else{
            ui.fill(200,200,5);
            ui.rect(quart + 20, ui.height-60, 80, bHeight);
        }

        if (ui.checkKey('r') )
        {
            ui.fill(8,255,60);
            ui.rect(quart + 20, ((ui.height-60) - bUp)-bUp, 80, bHeight);
            
        }
        else{
            ui.fill(200,200,5);
            ui.rect(quart + 20, ui.height-60, 80, bHeight);
        }



                
        ui.rect(quart + 70, 20, third, quart-100);
        if (ui.checkKey('h') )
        {
            ui.fill(ui.random(100,255),100,25);
            ui.rect(quart + 70, 20, third, quart-100);
        }
        ui.noStroke();
        ui.fill(255);
        // A simple way to draw the wave with an ellipse at each location
        for (int x = 0; x < ui.yvalues.length; x++) {
            ui.colorMode(UI.HSB);
            ui.fill(ui.random(100,255),ui.random(100,255),ui.random(100,255));
          ui.ellipse(x*ui.xspacing+(ui.width/13)*5, ui.height/12+ui.yvalues[x], 40, 16);
          ui.colorMode(UI.RGB);
          
        }




        ui.strokeWeight(1);
    }



}







