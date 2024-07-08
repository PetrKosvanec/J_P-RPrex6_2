/**
 * File: Main.java
 * ---------------
 * 2.
 * Write a program that simulates flipping a coin repeatedly and continues until
 * three consecutive heads are tossed. At that point, your program should display
 * the total number of times the coin was flipped. The following is one possible
 * sample run of the program:
 * ConsecutiveHeads
 * Tails
 * Heads
 * Heads
 * Tails
 * Tails
 * Heads
 * Tails
 * Heads
 * Heads
 * Heads
 * It took 10 flips to get 3 consecutive heads.
 *  *
 */

import acm.program.*;
import acm.util.*;

public class Main extends ConsoleProgram {

    public static void main(String[] args) {
        new Main().start(args);
    }

    public void run() {
        println("ConsecutiveHeads");
        int nFlips;
        int nConsecHeads = 0;
        for(nFlips = 1; nConsecHeads <= 3; nFlips++) {
            boolean b = rg.nextBoolean();
            println((new TailsOrHeads(b)).toString());
            if(b) {
                nConsecHeads++;
            }
            else {
                nConsecHeads = 0;
            }
            if(nConsecHeads == 3) {break;}
        }

        println("It took " + nFlips + " flips to get 3 consecutive heads.");
    }

    /* Instance variables */
    private RandomGenerator rg = RandomGenerator.getInstance();
}
