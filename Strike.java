import static java.lang.System.out;
import java.util.ArrayList;

// check to see if the players numbers match the winning numbers
public class Strike {

    // instance vairables: class vairables accessble by methods in the class
    private Draw draw = new Draw();
    // private Draw winner = new Draw();

    private int[] winningDraw;
    private int[] playerDraw;

    // constructor class
    public void Strike() {

        winningDraw = draw.startDraw();
        playerDraw = draw.startDraw();

        printArray(winningDraw);
        out.println("");
        printArray(playerDraw);

    }

    public void printArray(int[] arrayPassed) {
        out.println("PrintArray()");
        for (int i = 0; i < arrayPassed.length; i++) {
            out.print(" " + arrayPassed[i]);
        }
    }


}







// assigning the winning draw

// winningDraw = winner.startDraw();
// playerDraw = player.startDraw();

// winningDraw = draw.startDraw();
// System.out.println("winningDraw Done");
// out.println(winningDraw);
// draw.reset();
// playerDraw = draw.startDraw();
// System.out.println("PlayerDraw Done");
//
// // compair the two draws
// System.out.println("winning draw: " + winningDraw);
// out.println("player draw: " + playerDraw);
