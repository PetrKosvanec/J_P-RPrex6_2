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

    /* DELAY, USEFUL. stack overflow: How do I make a delay in Java? */
    public void run() {
        println("ConsecutiveHeads");
        while(true) {
            TailsOrHeads flip = new TailsOrHeads(rg.nextBoolean());
            println(flip.toString());
            if(flip.getConsecHeadsCounter() == 3) {
                println("It took " + flip.getFlipsCounter() + " flips to get 3 consecutive heads.");
                break;
            }
        }
    }

    /* Instance variables */
    private RandomGenerator rg = RandomGenerator.getInstance();
}
