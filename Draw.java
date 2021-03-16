import java.util.Random;
// import java.util.ArrayList;

// Draws the balls out into an array
public class Draw {

    // instance vairables: class vairables accesseable by methods in the class
    private final int MAXNUMBERS = 8;   // 6 lotto balls + bonas + powerball
    private final int MAXLOTTOBALLS = 7; // max amount of lotto balls + bonus ball
    private final int UPPER = 40;       // max number for each indevidual number
    private final int LOWER = 1;
    private final int POWERBALLUPPER = 10;
    private int number;             // temp vairable for generating the random num
    private int counter = 0;
    private boolean running = true;     // used keep generating numbers for the draw array

    private Random random = new Random();
    private int[] draw = new int[MAXNUMBERS];


    // constructor class
    public int[] startDraw() {

        reset();
        // TODO: if user wants to input sub drawNumbers for userInput
        drawNumbers();
        return getNumbers();
    }

    public void drawNumbers() {

        // draw 6 lotto balls and a bonus ball
        for (int num = 0; num < MAXLOTTOBALLS; num++) {
            generateNumbers(false);
            draw[num] = number;
            // counter++;
        }

        generateNumbers(true);
        draw[7] = number;       // powerball index
    }

    public void generateNumbers(boolean powerball) {
        if (! powerball) {
            // generate the random number between lower and upper   cc: https://stackoverflow.com/questions/16332938/java-random-number-but-not-zero
            number = random.nextInt(UPPER - LOWER) + LOWER;

            // while loop checks if it is in the draw: if so it enters while
            while (checkArray(number)) {
                // once entered we will generate numbers until its one thats not in the array
                number = random.nextInt(UPPER - LOWER) + LOWER;
            }

        } else {    // generate the powerball number
            number = random.nextInt(POWERBALLUPPER);
        }



    }

    public boolean checkArray(int genNumber) {
        // itterates therough the array
        for (int num = 0; num < draw.length; num++) {
            // checks if the number is in the array
            if (genNumber == draw[num]) {
                // returns true meaning yes the number is in the array
                return true;
            }
        }
        // other wise no the number is not in the array and can be added
        return false;
    }

    // return the arraylist containing the draw of numbers
    public int[] getNumbers() {
        return draw;
    }

    public void reset() {
        draw = new int[MAXNUMBERS];
    }

}



// Draw winning numbers
// Draw player numbers

// win with strike if
    // players numbers are in line with winning numbers
