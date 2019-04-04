package ie.tudublin;



public class Cockpit {

    private UI ui;

    public Cockpit(UI ui) {
        this.ui = ui;
    }

    public void render() {
        float third = ui.height/3;
        float quart = ui.height/4;
        float midDash = ui.height-third;
        
        ui.stroke(100);
        ui.strokeWeight(5);

        ui.fill(125, 125, 137);
        
        
        // ui.line(5, ui.height - third,quart ,ui.height-quart);
        // ui.line(quart, ui.height-quart, ui.width-quart, ui.height-quart);
        // ui.line(ui.width-quart, ui.height-quart, ui.width-5, ui.height-third);
        // ui.line(ui.width-5, ui.height-third, ui.width-5, ui.height-5);
        // ui.line(ui.width-5, ui.height-5, 5, ui.height-5);
        // ui.line(5, ui.height-5, 5, ui.height-third);

        ui.beginShape(); // necessary for filling in the dashboard
        ui.vertex(5, ui.height-third);
        ui.vertex(quart,ui.height-quart);
        ui.vertex(ui.width-quart,ui.height-quart);
        ui.vertex(ui.width-5, ui.height-third);
        ui.vertex(ui.width-5, ui.height-5);
        ui.vertex(5, ui.height-5);
        ui.vertex(5, ui.height-third);
        ui.endShape();

        ui.beginShape();
        ui.vertex(0, quart);
        ui.vertex(quart, third/2);
        ui.vertex(ui.width-quart, third/2);
        ui.vertex(ui.width,quart);
        ui.vertex(ui.width,0);
        ui.vertex(0, 0);
        ui.vertex(0, quart);
        ui.endShape();

        ui.fill(73, 73, 73);
        ui.stroke(33);
        ui.rect(quart+20,ui.height- quart-50, 70, 50);
        ui.rect(quart + 37, ui.height-quart-75, 35, 25);

        ui.rect(quart+40+ third,ui.height- quart-50, 70, 50);
        ui.rect(quart + 57 + third, ui.height-quart-75, 35, 25);



        ui.strokeWeight(1);
    }


}







