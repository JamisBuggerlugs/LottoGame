import static java.lang.System.out;
import java.util.ArrayList;
import java.util.*;

// check to see if the players numbers match the winning numbers
public class Strike {

    // instance vairables: class vairables accessble by methods in the class
    private Draw draw = new Draw();
    // private Draw winner = new Draw();

    private final int STRIKECOLLUMS = 4;

    private int[] winningDraw;      // winning draw
    private int[] playerDraw;       // players draw
    private int strikePoints = 0;   // used to calculate the winning strike div
    private int[] strikeOutcomes = new int[5];  // Games, S1, S2, S3, S4

    // constructor class
    public Strike() {
        ;
    }

    public void startGame(int[] lottoWinningDraw, int[] lottoPlayerDraw) {
        reset();

        // the lotto class has already drawn the arrays we need
        winningDraw = lottoWinningDraw;     // setting the draws
        playerDraw = lottoPlayerDraw;

        // compair the arrays
        compairDraws();
        strikePrizeDiv();

        strikeOutcomes[0]++;        // adding 1 to the strike games

        // debugging();
    }

    // itterates through all the numbers in the array printin them to the screen
    public void printArray(int[] arrayPassed) {
        // out.println("PrintArray()");        // debugging print statement
        // itterates through the array
        for (int i = 0; i < arrayPassed.length; i++) {
            // printing each value of the array to the screen on the same line
            out.print(" " + arrayPassed[i]);
        }
    }

    // compairs the first 4 numbers in the players draw to the winning draw
    public void compairDraws() {
        // itterate through all the collums checking for matching numbers
        for (int collum = 0;  collum < STRIKECOLLUMS; collum++) {
            // a number has matched in the same collum
            if (winningDraw[collum] == playerDraw[collum]) {
                strikePoints++;     // adding a score to calculate what prize div
            }
        }

    }

    // Calculate the prize division from the strikePoints
    public void strikePrizeDiv() {

        if (strikePoints == 1) {        // 1 strike point = Strike One
            // out.println("You win Strike 1");
            strikeOutcomes[1]++;    // adding 1 to the S1 outcomes
        } else if (strikePoints == 2) {  // 2 strike points = Strike Two
            // out.println("You win Strike 2");
            strikeOutcomes[2]++;     // adding 1 to the S2 outcomes
        } else if (strikePoints == 3) { // 3 strike points = Strike Three
            // out.println("You win Strike 3");
            strikeOutcomes[3]++;     // adding 1 to the S3 outcomes
        } else if (strikePoints == 4) { // 4 strike points = Strike Four
            // out.println("You win Strike 4");
            strikeOutcomes[4]++;    // adding 1 to the S4 outcomes
        } else {                        // no strike points
            // out.println("Unfortunately you were not a winner today.");
        }
    }

    // resets the strikePoints vairable
    public void reset() {
        strikePoints = 0;
    }

    // returns the strike statistics
    public int[] strikeStatistics() {
        return strikeOutcomes;
    }

    // used for debugging the code
    public void debugging() {
        printArray(winningDraw);
        out.println("");
        printArray(playerDraw);
        out.println("");
        out.println("\nstrikePoints: " + strikePoints);

    }


}
