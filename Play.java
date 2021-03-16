import static java.lang.System.out;
import java.util.ArrayList;
import java.util.*;

public class Play {

    // all the statistical vairables needed
    public static int[] lottoStatistics;
    public static int[] strikeStatistics;

    public static void main(String[] args) {

        Lotto game = new Lotto();   // creating the Lotto object that will run Strike when needed

        //  currently running 1 billion (1000000000)
        final int MAXGAMES = 1000000000;   // the amount of games that will run


        // check if we are playing strike with out lotto game

        for (int i = 0; i < (MAXGAMES * 10); i++) {

            game.startGame();   // starts the lotto game

        }

        lottoStatistics = game.lottoStatistics();
        strikeStatistics = game.strikeStatistics();

        printStatistics();

        // debugging();

    }

    // itterates through all the numbers in the array printin them to the screen
    public static void printArray(int[] arrayPassed) {
        // out.println("PrintArray()");        // debugging print statement
        // itterates through the array
        for (int i = 0; i < arrayPassed.length; i++) {
            // printing each value of the array to the screen on the same line
            out.print(" " + arrayPassed[i]);
        }
    }


    public static void printStatistics() {
        out.println("Lotto Statistics: "); printArray(lottoStatistics);
        out.println("\nStrike Statistics: "); printArray(strikeStatistics);
    }

    public static void debugging() {
        out.println("\n\n");
        printArray(lottoStatistics);
        out.println("");
        printArray(strikeStatistics);
    }
}
