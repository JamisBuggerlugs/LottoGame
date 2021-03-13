import static java.lang.System.out;
import java.util.ArrayList;

// check to see if the players numbers match the winning numbers
public class Strike {

    // instance vairables: class vairables accessble by methods in the class
    private Draw draw = new Draw();
    // private Draw winner = new Draw();

    private int[] winningDraw;      // winning draw
    private int[] playerDraw;       // players draw
    private int strikePoints = 0;


    // constructor class
    public void Strike() {

        winningDraw = draw.startDraw();
        playerDraw = draw.startDraw();

        // compair the arrays
        compairDraws();


        printArray(winningDraw);
        out.println("");
        printArray(playerDraw);

    }

    public void printArray(int[] arrayPassed) {
        // out.println("PrintArray()");        // debugging print statement
        // itterates through the array
        for (int i = 0; i < arrayPassed.length; i++) {
            // printing each value of the array to the screen on the same line
            // out.print(" " + arrayPassed[i]);
        }
    }

    public void compairDraws() {

        // if a collum matches:
            strikePoints++; 

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
