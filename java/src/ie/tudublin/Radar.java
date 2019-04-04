package ie.tudublin;




public class Radar
{
    private float x;
   // private float ex = 100;
    private float y;
    float r = 0;
    private float diameter;
    private float radius;
    private float rotation;
    UI ui;

    public Radar(UI ui,float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter/2;
    }

    public void render()
    {
        float third = ui.height/3;
        float quart = ui.height/4;
        
        float midDash = ui.height-(quart/2);



        ui.pushMatrix();
        ui.translate(ui.width/2,midDash);
        ui.rotate(rotation);
       // ui.translate(x,y);
        ui.stroke(0); 
        ui.noFill();
        //ui.rect(0,0,radius,radius);
        ui.fill(21, 112, 37);

        ui.ellipse(0, 0, diameter, diameter);
        ui.noFill();
        ui.ellipse(0, 0, (diameter/4)*3, (diameter/4)*3);
        ui.ellipse(0, 0, diameter/2, diameter/2);
        ui.ellipse(0, 0, diameter/4, diameter/4);
        ui.line(0, 0, radius, 0);


        ui.popMatrix();

    }

    public void update()
    {
        rotation += .01f;
        if (ui.checkKey('f') )
        {
            rotation += .05f;
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