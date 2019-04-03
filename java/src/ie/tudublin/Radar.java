package ie.tudublin;




public class Radar
{
    private float x;
    private float ex = 100;
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
        ui.pushMatrix();
        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(rotation);
       // ui.translate(x,y);
        ui.stroke(255); 
        ui.noFill();
        ui.rect(0,0,radius,radius);
        ui.ellipse(0, 0, diameter, diameter);
        ui.line(0, 0, radius, 0);


        ui.popMatrix();

    }

    public void update()
    {
        if (ui.checkKey('w') )
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