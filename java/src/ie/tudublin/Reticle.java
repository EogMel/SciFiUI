package ie.tudublin;

public class Reticle extends UiObject{
    private float r;
    private float radius;
    private float midDash;
    

    public Reticle(UI ui, float x, float y, float z, float third, float quart, float diameter, float rotation){
        super(ui, x, y, z,third,quart,diameter,rotation);
        radius = diameter/2;
        r =0 ;
        third = ui.height/3;
        quart = ui.height/4;
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
        ui.ellipse(ui.mouseX, ui.mouseY, 150, 150);
        ui.ellipse(ui.mouseX, ui.mouseY, 200, 200);
        }


     }
     public void update()
     {
        float third = ui.height/3;
        float quart = ui.height/4;
        
        


        if (ui.checkKey(' ') )
        {   
            ui.stroke(183, 62, 1);
            ui.strokeWeight(6);
            ui.line(quart + 55, ui.height-quart-50, ui.mouseX,ui.mouseY);
            ui.stroke(178, 37, 1);
            ui.strokeWeight(4);
            ui.line(quart + 55, ui.height-quart-50, ui.mouseX,ui.mouseY);
            ui.stroke(255);
            ui.strokeWeight(1);
            ui.line(quart + 55, ui.height-quart-50, ui.mouseX,ui.mouseY);



            ui.stroke(183, 62, 1);
            ui.strokeWeight(6);
            ui.line(quart + 75 + third, ui.height-quart-50, ui.mouseX,ui.mouseY);
            ui.stroke(178, 37, 1);
            ui.strokeWeight(4);
            ui.line(quart + 75 + third, ui.height-quart-50, ui.mouseX,ui.mouseY);
            ui.stroke(255);
            ui.strokeWeight(1);
            ui.line(quart + 75 + third, ui.height-quart-50, ui.mouseX,ui.mouseY);

            if(ui.player2.position() == ui.player2.length())
            {
                ui.player2.rewind();
                ui.player2.play();
            }
            else{
                ui.player2.play();
            }

                  
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