import java.util.Random;
import java.util.ArrayList;

// Draws the balls out into an array
public class Draw { 

    // instance vairables: class vairables accesseable by methods in the class
    private final int MAXNUMBERS = 6;   // max amount of numbers in the draw
    private final int UPPER = 40;       // max number for each indevidual number
    private int number;             // temp vairable for generating the random num

    private Random random = new Random();
    private ArrayList draw = new ArrayList();
    private ArrayList drawReturn = new ArrayList();


    // constructor class
    public ArrayList startDraw() {
        System.out.println("draw pre reset: " + draw);
        reset();
        System.out.println("draw after reset: " + draw);
        drawNumbers();

        drawReturn = getNumbers();
        return drawReturn;
    }

    public void drawNumbers() {
        reset();
        // itterate through adding numbers MAXNUMBERS amount of time
        while (draw.size() < MAXNUMBERS) { // FIXME:
            // generate random numbers
            number = random.nextInt(UPPER);
            // add it to the list if  number is not in the list
            if (! draw.contains(number)) {
                draw.add(number);
            }
            System.out.println("draw after reset: " + draw);
        }


    }

    // return the arraylist containing the draw of numbers
    public ArrayList getNumbers() {
        return draw;
    }

    public void reset() {
        draw.clear();
    }

}



// Draw winning numbers
// Draw player numbers

// win with strike if
    // players numbers are in line with winning numbers
