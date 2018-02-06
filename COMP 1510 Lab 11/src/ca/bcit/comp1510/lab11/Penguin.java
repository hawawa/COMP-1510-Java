/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Represents a penguin.
 * Extends Bird.
 * Implements Aquatic and Terrestrial. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Penguin extends Bird implements Aquatic, Terrestrial {
    /**
     * Constructs a penguin by defining age and feather colour.
     * @param age
     *            a integer for penguin's age
     * @param featherColour
     *            a string for penguin's feather colour
     */  
    public Penguin(int age, String featherColour) {
        super(age, featherColour);
    }
    
    /**
     * Does eat.
     */  
    public void eat() {
        System.out.println("I love oily nutritious fish!");
    }
    
    /**
     * Does move.
     */  
    public void move() {
        run();
        swim();
    }
    
    /**
     * Does run.
     */  
    public void run() {
        System.out.println("Waddle, waddle, waddle!");
    }
    
    /**
     * Does swim.
     */  
    public void swim() {
        System.out.println("Splash!");
    }

}
