import static java.lang.System.out;
import java.util.ArrayList;
import java.util.*;

public class Play {

    public static void main(String[] args) {

        Lotto game = new Lotto();   // creating the Lotto object that will run Strike when needed
        final int MAXGAMES = 100;   // the amount of games that will run
        // all the statistical vairables needed

        // check if we are playing strike with out lotto game

        for (int i = 0; i < MAXGAMES; i++) {

            game.startGame();   // starts the lotto game

        }


    }

}
