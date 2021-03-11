import static java.lang.System.out;
import java.util.ArrayList;

// check to see if the players numbers match the winning numbers
public class Strike {

    // instance vairables: class vairables accessble by methods in the class
    private Draw player = new Draw();
    private Draw winner = new Draw();

    private ArrayList winningDraw;
    private ArrayList playerDraw;

    // constructor class
    public void Strike() {

        // assigning the winning draw

        winningDraw = winner.startDraw();
        playerDraw = player.startDraw();

        // System.out.println("winningDraw Done");
        // out.println(winningDraw);
        // draw.reset();
        // playerDraw = draw.startDraw();
        // System.out.println("PlayerDraw Done");

        // compair the two draws
        System.out.println("winning draw: " + winningDraw);
        out.println("player draw: " + playerDraw);

    }


}
