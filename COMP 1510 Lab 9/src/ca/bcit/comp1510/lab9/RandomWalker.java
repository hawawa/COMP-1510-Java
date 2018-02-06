/**
 * 
 */
package ca.bcit.comp1510.lab9;
import java.util.Random;

/**
 * <p>
 * Represents a random walker.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class RandomWalker {
    /** Hold the current X-coordinate. */
    private int currentX;
    /** Hold the current Y-coordinate. */
    private int currentY;
    /** Hold the max steps. */
    private int maxSteps;
    /** Hold the current steps. */
    private int currentSteps;
    /** Hold the boundary. */
    private int boundary;
    /** Hold the maximum distance. */
    private int maximumDistance;
    
    /**
     * Constructs a random walker object by defining its max steps and boundary.
     * @param maxSteps
     *            a integer for max steps
     * @param boundary
     *            a integer for boundary
     */
    public RandomWalker(int maxSteps, int boundary) {
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        this.currentX = 0;
        this.currentY = 0;
        this.currentSteps = 0;
        this.maximumDistance = 0;
    }
    
    /**
     * Constructs a random walker object by defining 
     * its current X-coordinate, current Y-coordinate, max steps and boundary.
     * @param currentX
     *            a integer for current X-coordinate
     * @param currentY
     *            a integer for current Y-coordinate
     * @param maxSteps
     *            a integer for max steps
     * @param boundary
     *            a integer for boundary
     */
    public RandomWalker(int currentX, int currentY,
            int maxSteps, int boundary) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        this.currentSteps = 0;
        this.maximumDistance = 0;
    }
    
    /**
     * Returns a String representation of this random walker.
     * @return String representation of this random walker.
     */
    public String toString() {
        return "currentX = " + currentX + ", currentY = " + currentY 
                + ", currentSteps = " + currentSteps + ".";
    }
    
    /**
     * Moves a random direction.
     */
    public void takeStep() {
        Random generator = new Random();
        final int directions = 4;
        char move = (char) ('A' + generator.nextInt(directions));
                
        switch (move) {
        case 'A':
            currentX++;
            break;
        case 'B':
            currentY++;
            break;
        case 'C':
            currentX--;
            break;
        case 'D':
            currentY--;
            break;
        default:
        }
        currentSteps++;
        maximumDistance = max(maximumDistance,
                max(Math.abs(currentX), Math.abs(currentY)));
                
    }
    
    /**
     * Returns if the current steps less than max steps.
     * @return boolean represents if the current steps less than max steps.
     */
    public boolean moreSteps() {
        return currentSteps < maxSteps;
    }
    
    /**
     * Returns if the current position is in boundary.
     * @return boolean represents if the current position is in boundary..
     */
    public boolean inBounds() {
        return currentX <= boundary && currentX >= -boundary 
                && currentY <= boundary && currentY >= -boundary;
    }
    
    /**
     * Moves until max steps or outside of boundary.
     */
    public void walk() {
        while (this.moreSteps() && this.inBounds()) {
            this.takeStep();
        }
    }
    
    /**
     * Returns the larger integer of two integers.
     * @param a
     *            a integer for first number
     * @param b
     *            a integer for second number
     * @return integer is larger.
     */
    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    /**
     * Accessor for maximum distance.
     * @return integer representation of maximum distance.
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }
    
    /**
     * Accessor for current X-coordinate.
     * @return integer representation of current X-coordinate.
     */
    public int getCurrentX() {
        return currentX;
    }
    
    /**
     * Accessor for current Y-coordinate.
     * @return integer representation of current Y-coordinate.
     */
    public int getCurrentY() {
        return currentY;
    }

}
