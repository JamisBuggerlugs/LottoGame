import java.util.Random;
// import java.util.ArrayList;

// Draws the balls out into an array
public class Draw {

    // instance vairables: class vairables accesseable by methods in the class
    private final int MAXNUMBERS = 6;   // max amount of numbers in the draw
    private final int UPPER = 40;       // max number for each indevidual number
    private int number;             // temp vairable for generating the random num
    private int counter = 0;
    private boolean running = true;     // used keep generating numbers for the draw array

    private Random random = new Random();
    private int[] draw = new int[MAXNUMBERS];


    // constructor class
    public int[] startDraw() {

        reset();
        drawNumbers();
        return getNumbers();
    }

    public void drawNumbers() {

        // itterate the length of the array number of times, generating n numbers
        for (int num = 0; num < draw.length; num++) {
            generateNumbers();
            draw[num] = number;
            // counter++;
        }

        System.out.println("drawNumbers()" + draw);


    }

    public void generateNumbers() {
        // generate the random number and
        number = random.nextInt(UPPER);

        // while loop checks if it is in the draw: if so it enters while
        while (checkArray(number)) {
            // once entered we will generate numbers until its one thats not in the array
            number = random.nextInt(UPPER);
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
        // itterates therough the array
        // for (int num = 0; num < draw.length; num++) {
        //     // setting all the values to 0, effectively resetting it
        //     draw[num] = 0;
        // }

        draw = new int[MAXNUMBERS]; 
    }

}



// Draw winning numbers
// Draw player numbers

// win with strike if
    // players numbers are in line with winning numbers
