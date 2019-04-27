package ie.tudublin;




public class Radar extends UiObject
{
    
    private float r;
    private float radius;
    private float midDash;
    

    public Radar(UI ui, float x, float y, float z, float third, float quart, float diameter, float rotation){
        super(ui, x, y, z,third,quart,diameter,rotation);
        radius = diameter/2;
        r =0 ;
        third = ui.height/3;
        quart = ui.height/4;
    }

    public void render()
    {  
        midDash = ui.height-(quart/2);



        ui.pushMatrix();
        ui.translate(ui.width/2,midDash);
        ui.rotate(rotation);
       // ui.translate(x,y);
        ui.stroke(0); 
        ui.noFill();
        //ui.rect(0,0,radius,radius);
        ui.fill(21, 180, 37);

        ui.ellipse(0, 0, diameter, diameter);
        ui.noFill();
        ui.ellipse(0, 0, (diameter/4)*3, (diameter/4)*3);
        ui.ellipse(0, 0, diameter/2, diameter/2);
        ui.ellipse(0, 0, diameter/4, diameter/4);
        ui.line(0, 0, radius, 0);


        ui.popMatrix();

        if (ui.checkKey('h') )
        {
            ui.pushMatrix();
            ui.translate(ui.width/2,midDash);
            ui.rotate(rotation);
           // ui.translate(x,y);
            ui.stroke(0); 
            ui.noFill();
            //ui.rect(0,0,radius,radius);
            ui.fill(21, ui.random(90,190), 37);
    
            ui.ellipse(0, 0, diameter, diameter);
            ui.noFill();
            ui.ellipse(0, 0, (diameter/4)*3, (diameter/4)*3);
            ui.ellipse(0, 0, diameter/2, diameter/2);
            ui.ellipse(0, 0, diameter/4, diameter/4);
            ui.line(0, 0, radius, 0);
    
    
            ui.popMatrix();
        }

        ui.pushMatrix();
        ui.translate(ui.width-quart+radius+20, midDash);
        ui.rotate(rotation);
        ui.stroke(75);
        ui.strokeWeight(3);
        ui.fill(53, 94, 160);
        ui.ellipse(0, 0, diameter, diameter);

        ui.strokeWeight(8);
        ui.stroke(0,0,255);
        ui.arc(0, 0, diameter-18, diameter-18, 0, UI.HALF_PI *4/3);
        ui.stroke(250,0,250);
        ui.arc(0, 0, diameter-40, diameter-40, UI.HALF_PI, 3/2*UI.PI);
        ui.stroke(150,50,255);
        ui.arc(0, 0, diameter-60, diameter-60, 0-UI.PI, UI.HALF_PI-UI.QUARTER_PI);
        ui.stroke(255,50,50);
        ui.arc(0, 0, diameter-85, diameter-85, 0-UI.HALF_PI, UI.PI);


        ui.popMatrix();
        ui.stroke(0); 
        ui.strokeWeight(1);
        //ui.rotate(rotation);


        if (ui.checkKey('h') )
        {
            ui.pushMatrix();
            ui.translate(ui.width-quart+radius+20, midDash);
            ui.rotate(rotation);
            ui.fill(53, 94, ui.random(100,255));
            ui.ellipse(0, 0, diameter, diameter);
            ui.stroke(0,0,255);
            ui.strokeWeight(ui.random(5,9));
            ui.arc(0, 0, diameter-18, diameter-18, 0, UI.HALF_PI *4/3);
            ui.stroke(250,0,250);
            ui.arc(0, 0, diameter-40, diameter-40, UI.HALF_PI, 3/2*UI.PI);
            ui.stroke(150,50,255);
            ui.arc(0, 0, diameter-60, diameter-60, 0-UI.PI, UI.HALF_PI-UI.QUARTER_PI);
            ui.stroke(255,50,50);
            ui.arc(0, 0, diameter-85, diameter-85, 0-UI.HALF_PI, UI.PI);
            ui.popMatrix();
        }
    }

    public void update()
    {
        rotation += .01f;
        if (ui.checkKey('f') )
        {
            rotation += .05f;
        }
        if (ui.checkKey('r') )
        {
            rotation += .10f;
        }
        if (ui.checkKey('h') )
        {
            rotation += .25f;
        }
        

        
    }





    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the diameter
     */
    public float getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }

    /**
     * @return the r
     */
    public float getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        this.r = r;
    }

    /**
     * @return the rotation
     */
    public float getRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     */
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }



}