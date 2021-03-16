import static java.lang.System.out;
import java.util.ArrayList;

// Runs all of the Draw and Strike files together  --> Game/Main files
public class Lotto {

    // instance vairables: class vairables accessble by methods in the class
    private Draw draw = new Draw();     // craeting the draw object to draw arrays
    private Strike strike = new Strike(); // creating the strike object

    private final int LOTTOCOLLUMINDEX = 5; // number of collums to check for the checkDraw function minus 1
    private final int BBINDEX = 6;      // index of the bonus ball inside the draw array
    private final int PBINDEX = 7;      // index of the powerball indide the draw array

    private int[] winningDraw;      // winning draw
    private int[] playerDraw;       // players draw
    private int lottoPoints = 0;    // used to calculate the division the player has won
    private boolean strikeEnabled = true;   // user can chose weather they want to play strike as well as lotto
    // statistcal vairables
    private int[] lottoOutcomes = new int[8];   // Game, Div 1 - 7
    // strike statistical vairables;
    private int[] strikeStatictics;



    // constructor class  -  A.K.A __init__
    public Lotto() {
        // startGame();
        ;
    }

    public void startGame() {
        reset();        // reset all relevent vairbales for the next game

        // create the winning and player draws
        winningDraw = draw.startDraw();
        playerDraw = draw.startDraw();

        checkDraw();
        if (strikeEnabled) { strike.startGame(winningDraw, playerDraw); }
        lottoPrizeDiv();

        lottoOutcomes[0]++;     // incrementing the game played stat

        // debugging();

    }

    // checks to see if any of the 6 numbers from players draw is in
    public void checkDraw() {
        // for every collum in the winning draw
        for (int winnerCollum = 0; winnerCollum < LOTTOCOLLUMINDEX; winnerCollum++) {      // FIXME: change to an advanced for loop
            // itterate through all the numbers in the players draw
            for (int playerCollum = 0; playerCollum < LOTTOCOLLUMINDEX; playerCollum++) {  // FIXME: change to an advanced for loop
                // check if the numbers match
                if (winningDraw[winnerCollum] == playerDraw[playerCollum]) {
                    // if the numbers match: lottoPoints++
                    lottoPoints++;
                }
            }
        }
    }

    // Calculate the prize division from the strikePoints
    public void lottoPrizeDiv() {   //FIXME: either super low chances for bonus ball matches or doesnt work
        // if (lottoPoints == 3 && playerDraw[BBINDEX] == winningDraw[BBINDEX]) {
        //     debugging();
        //     out.println("Bonus Ball:      Player Draw: " + playerDraw[BBINDEX] + " WinningDraw: " + winningDraw[BBINDEX]);
        // }

        //  3 lotto + powerball = Div 7
        if (lottoPoints == 3 && playerDraw[PBINDEX] == winningDraw[PBINDEX]) {
            lottoOutcomes[7]++;     // adding to the div 7 wins
        }
        // 3 lotto + bonus + powerball = div 6
        else if (lottoPoints == 3 && playerDraw[BBINDEX] == winningDraw[BBINDEX] && playerDraw[PBINDEX] == winningDraw[PBINDEX]) {
            lottoOutcomes[6]++;
        }
        // 4 lotto + powerball = div 5
        else if (lottoPoints == 4 && playerDraw[PBINDEX] == winningDraw[PBINDEX]) {
            lottoOutcomes[5]++;
        }
        // 4 lotto + bonus + powerball = div 4
        else if (lottoPoints == 4 && playerDraw[BBINDEX] == winningDraw[BBINDEX] && playerDraw[PBINDEX] == winningDraw[PBINDEX]) {
            lottoOutcomes[4]++;
        }
        // 5 lotto + powerball = div 3
        else if (lottoPoints == 5 && playerDraw[PBINDEX] == winningDraw[PBINDEX]) {
            lottoOutcomes[3]++;
        }
        // 5 lotto + bonus + powerball = div 2
        else if (lottoPoints == 5 && playerDraw[BBINDEX] == winningDraw[BBINDEX] && playerDraw[PBINDEX] == winningDraw[PBINDEX]) {
            lottoOutcomes[2]++;
        }
        // 6 lotto + powerball = div 1
        else if (lottoPoints == 6 && playerDraw[PBINDEX] == winningDraw[PBINDEX]) {
            lottoOutcomes[3]++;
        }
    }

    // returning lotto statistics to the running file
    public int[] lottoStatistics() {
        return lottoOutcomes;
    }

    // returning the strike statistics to the running file
    public int[] strikeStatistics() {
        strikeStatictics = strike.strikeStatistics();
        return strikeStatictics;
    }

    // resets all relevent vairables for next games
    public void reset() {
        lottoPoints = 0;
    }

    // itterates through all the numbers in the array printin them to the screen
    public void printArray(int[] arrayPassed) {
        // out.println("PrintArray()");        // debugging print statement
        // itterates through the array
        for (int i = 0; i < arrayPassed.length; i++) {
            // printing each value of the array to the screen on the same line
            out.print(" " + arrayPassed[i]);
            if (i > 4) {
                out.print("  ");
            }
        }
    }

    public void debugging() {
        printArray(winningDraw);
        out.println("");
        printArray(playerDraw);
        out.println("");
        // out.println("\nlottoPoints: " + lottoPoints);

    }
}
