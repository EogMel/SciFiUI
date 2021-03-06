package ie.tudublin;

public class Stars extends UiObject
{
    private float pz;
    private float sx;
    private float sy;
    

    

    public Stars(UI ui, float x, float y, float z){
        super(ui, x, y, z);
        
    }
    

    public void render()
    {
        ui.fill(255);
        ui.noStroke();

        sx = ui.map(x / z, 0, 1, 0, ui.width/2);
        sy = ui.map(y / z, 0, 1, 0, ui.height/2);


        float r = ui.map(z, 0, ui.width/2, 20, 0);
        ui.fill(249, 234, 255);
         ui.ellipse(sx, sy, r, r);


         float px = ui.map(x / pz, 0, 1, 0, ui.width/2);
         float py = ui.map(y / pz, 0, 1, 0, ui.height/2);
        // pz = z ;

         if (ui.checkKey('h'))
         {
            if(ui.player4.position() == ui.player4.length())
            {
                ui.player4.rewind();
                ui.player4.play();
            }
            else{
                ui.player4.play();
            }


             ui.stroke(167, 165, 255);
             ui.strokeWeight(.55f);
             
             ui.line(px, py, sx, sy);
            
         
         
             z-= 20;


 
       
         }
     }




    public void update()
    {
        
        z -= 2;

        
        if (ui.checkKey('s') )
        {
            y -= 1.5f;
        }
        if (ui.checkKey('w') )
        {
            y += 1.5f;
        }
        if (ui.checkKey('a') )
        {
            x += 1.5f;
        }
        if (ui.checkKey('d') )
        {
            x -= 1.5f;
        }
        if (ui.checkKey('f') )
        {
            z -= 4;
        }
        if (ui.checkKey('r') )
        {
            z -= 5;
        }


  
        if (z < 1) {
            z = ui.width/2;
            x = ui.random(-ui.width/2, ui.width/2);
            y = ui.random(-ui.height/2, ui.height/2);
            pz = z;
          }



    }


}