package ie.tudublin;

import static processing.core.PConstants.HALF_PI;
import static processing.core.PConstants.PI;

public class Cockpit {

    private UI ui;

    public Cockpit(UI ui) {
        this.ui = ui;
    }

    public void render() {
        float third = ui.height/3;
        float quart = ui.height/4;

        ui.stroke(255);
        ui.line(0, ui.height - third,quart ,ui.height-quart);
  
    }


}







