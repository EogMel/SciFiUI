package ie.tudublin;

public class Stars
{
    private float x;
    private float y;
    private float z;
    private float pz;
    private float sx;
    private float sy;
    UI ui;

    

    public Stars(UI ui,float x,float y ,float z){
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.z = z;
       // this.pz=z;
        


    }
    //Stars[] s = new Stars[400];

    public void render()
    {
        ui.fill(255);
        ui.noStroke();

        float sx = ui.map(x / z, 0, 1, 0, ui.width/2);
        float sy = ui.map(y / z, 0, 1, 0, ui.height/2);


        float r = ui.map(z, 0, ui.width/2, 16, 0);
        
         ui.ellipse(sx, sy, r, r);


         float px = ui.map(x / pz, 0, 1, 0, ui.width/2);
         float py = ui.map(y / pz, 0, 1, 0, ui.height/2);
        // pz = z ;

         if (ui.checkKey('h'))
         {
             
             ui.stroke(255);
             ui.strokeWeight(5/6);
             
             ui.line(px, py, sx, sy);
            
         
         
             z-= 20;
 
       
         }
     }




    public void update()
    {
        
        z -= 2;

        
        if (ui.checkKey('s') )
        {
            y -= 2;
        }
        if (ui.checkKey('w') )
        {
            y += 2;
        }
        if (ui.checkKey('a') )
        {
            x += 4;
        }
        if (ui.checkKey('d') )
        {
            x -= 4;
        }
        if (ui.checkKey('f') )
        {
            z -= 4;
        }
        if (ui.checkKey('r') )
        {
            z -= 7;
        }


        // float px = ui.map(x / z, 0, 1, 0, ui.width/2);
        // float py = ui.map(y / z, 0, 1, 0, ui.height/2);
        //pz = z ;
        if (z < 1) {
            z = ui.width/2;
            x = ui.random(-ui.width/2, ui.width/2);
            y = ui.random(-ui.height/2, ui.height/2);
            pz = z;
          }

        
        // if (ui.checkKey('h'))
        // {
            
        //     ui.stroke(255);
        //     ui.strokeWeight(1/2);
            
        //     ui.line(px+10, py+10, sx, sy);
           
        
        
        //     z-= 20;

      
        // }

        


    }


}