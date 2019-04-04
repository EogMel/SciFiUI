package ie.tudublin;

public class Reticle{
    private float x;
     private float y;
     float r = 0;
     private float diameter;
     private float radius;
     private float rotation;
     UI ui;

     public Reticle(UI ui)
     {
         this.ui = ui;
     
     }


     public void render()
     {
        float third = ui.height/3;
        float quart = ui.height/4;


        if(ui.mouseY > quart/2 && ui.mouseY < ui.height - quart){
        ui.noFill();
        ui.stroke(255,0,0);
        ui.line(ui.mouseX+50,ui.mouseY, ui.mouseX-50,ui.mouseY);
        ui.line(ui.mouseX,ui.mouseY+50, ui.mouseX,ui.mouseY-50);
        ui.ellipse(ui.mouseX, ui.mouseY, 100, 100);
        ui.ellipse(ui.mouseX, ui.mouseY, 200, 200);
        ui.ellipse(ui.mouseX, ui.mouseY, 300, 300);
        }


     }
     public void update()
     {
        // ui.ellipse(ui.mouseX, ui.mouseY, 100, 100);
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



}