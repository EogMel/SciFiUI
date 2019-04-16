package ie.tudublin;

public class Sound
{
    UI ui;

    public void update()
    {
        if(ui.player.position() == ui.player.length())
        {
            ui.player.rewind();
            ui.player.play();
        }
        else{
            ui.player.play();
        }
        if(ui.player1.position() == ui.player1.length())
        {
            ui.player1.rewind();
            ui.player1.play();
        }
        else{
            ui.player1.play();
        }
    }

}