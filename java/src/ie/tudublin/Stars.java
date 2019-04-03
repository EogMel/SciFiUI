package ie.tudublin;

public class Stars
{
    private float x;
    private float y;
    private float z;
    private float pz;
    private float sx;
    UI ui;

    

    public Stars(UI ui,float x,float y ,float z){
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.z = z;
        this.pz=z;
        


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






    }
    public void update()
    {
        
        z -= 2;

        
        if (ui.checkKey('s') )
        {
            z -= 2;
        }
        if (ui.checkKey('w') )
        {
            z -= 5;
        }
        if (ui.checkKey('e') )
        {
            z += 2;
        }
        if (ui.checkKey('d') )
        {
            z += 3;
        }

        if (z < 1) {
            z = ui.width/2;
            x = ui.random(-ui.width/2, ui.width/2);
            y = ui.random(-ui.height/2, ui.height/2);
            pz = z;
          }


    }


}