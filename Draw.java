import java.util.Random;
// import java.util.ArrayList;

// Draws the balls out into an array
public class Draw {

    // instance vairables: class vairables accesseable by methods in the class
    private final int MAXNUMBERS = 6;   // max amount of numbers in the draw
    private final int UPPER = 40;       // max number for each indevidual number
    private int number;             // temp vairable for generating the random num
    private int counter = 0;

    private Random random = new Random();
    private int[] draw = new int[MAXNUMBERS];
    private int[] drawReturn = new int[MAXNUMBERS];


    // constructor class
    public int[] startDraw() {
        drawNumbers();

        drawReturn = getNumbers();
        return drawReturn;
    }

    public void drawNumbers() {
        // reset();
        // itterate through adding numbers MAXNUMBERS amount of time
        while (draw.length < MAXNUMBERS) {
            // generate random numbers
            number = random.nextInt(UPPER);
            // add it to the list if  number is not in the list
            if (! checkArray(number)) {
                draw[counter] = number;
                counter++;
            }
            System.out.println("draw after reset: " + draw);
        }


    }

    public boolean checkArray(int genNumber) {
        for (int num = 0; num < draw.length; num++) {
            if (genNumber == draw[num]) {
                return true;
            } 
        }
        return false;
    }

    // return the arraylist containing the draw of numbers
    public int[] getNumbers() {
        return draw;
    }

    // public void reset() {
    //     Arrays.fill(draw, null);
    // }

}



// Draw winning numbers
// Draw player numbers

// win with strike if
    // players numbers are in line with winning numbers
