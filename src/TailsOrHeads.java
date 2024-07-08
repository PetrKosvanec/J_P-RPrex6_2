/*
 * File: TailsOrHeads.java
 * ---------------------------
 *
 * The TailsOrHeads class keeps the following pieces of data about the
 * flip: boolean true, representing "Heads", or false.
 *
 * This information is entirely private to the class.
 *
 * This program simulates flipping a coin repeatedly and continues until
 * three consecutive heads are tossed. At that point, it displays
 * the total number of times the coin was flipped.
 */

import acm.program.*;

public class TailsOrHeads extends ConsoleProgram {

    /**
     * Creates a new TailsOrHeads object (a coin flip object)
     * with the in-parameter specified true or false value.
     *
     * Manipulates - class variables - counters: Increments the flipsCounter.
     * Increments the consecHeadsCounter in case of Heads,
     * or in case of Tails initializes consecHeadsCounter to zero.
     */

    public TailsOrHeads(boolean b) {
        heads = b;
        flipsCounter++;
        if(heads) { consecHeadsCounter++; }
        else { consecHeadsCounter = 0; }
    }

    /**
     * Gets the integer value of consecutive heads pertaining to this flip.
     * @return The consecutive heads counter related to this flip
     */
    public int getFlipsCounter() {
        return flipsCounter;
    }

    /**
     * Gets the integer value of consecutive heads pertaining to this flip.
     * @return The consecutive heads counter related to this flip
     */
    public int getConsecHeadsCounter() {
        return consecHeadsCounter;
    }

    /**
     * Creates a string "Heads" or "Tails" identifying this flip
     * @return The string "Heads" or "Tails" used to display this flip
     */
    public String toString() {
        if (heads) {
            return "Heads";
        }
        else {
            return "Tails";
        }
    }

    /* Class variables */
    private static int consecHeadsCounter;
    private static int flipsCounter;

    /* Instance variables */
    private boolean heads;
}
