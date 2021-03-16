import static java.lang.System.out;
import java.util.ArrayList;

// Runs all of the Draw and Strike files together  --> Game/Main files
public class Lotto {

    public static void main(String[] args) {

        Strike strike = new Strike();   // creating the strike object
        final int GAMES = 10000000;          // the amount of games that will run

        int strikeWins = 0;             // amount of strike wins
        int[] strikeOutcomes;           // strike statictics


        for (int i = 0; i < GAMES; i++) {
            strike.Strike();

        }

        strikeOutcomes = strike.strikeStats();

        System.out.println("Strike Stats: ");
        printArray(strikeOutcomes);


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

    // checks to see if any of the 6 numbers from players draw is in
    public void checkDraws() {
        // for every collum in the winning draw
        for (int collum : )
            // itterate through all the numbers in the players draw

            // check if the numbers match

            // if they do: lottoPoints++

        ;
    }

    // Calculate the prize division from the strikePoints
    public void lottoPrizeDiv() {
        //  3 lotto + powerball = Div 7

        // 3 lotto + bonus + powerball = div 6

        // 4 lotto + powerball = div 5

        // 4 lotto + bonus + powerball = div 4

        // 5 lotto + powerball = div 3

        // 5 lotto + bonus + powerball = div 2

        // 6 lotto + powerball = div 1

        ;
    }


}
