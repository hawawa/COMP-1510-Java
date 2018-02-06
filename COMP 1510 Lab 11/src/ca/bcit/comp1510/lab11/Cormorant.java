/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Represents a cormorant.
 * Extends Bird.
 * Implements Aerial, Aquatic and Terrestrial. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Cormorant extends Bird implements Aerial, Aquatic, Terrestrial {
    /**
     * Constructs a cormorant by defining age and feather colour.
     * @param age
     *            a integer for cormorant's age
     * @param featherColour
     *            a string for cormorant's feather colour
     */  
    public Cormorant(int age, String featherColour) {
        super(age, featherColour);
    }
    
    /**
     * Does eat.
     */  
    public void eat() {
        System.out.println("Eat quickly, yum yum!");
    }
    
    /**
     * Does move.
     */  
    public void move() {
        run();
        swim();
        fly();
    }
    
    /**
     * Does swim.
     */  
    public void swim() {
        System.out.println("am a great diver, watch out fish!");
    }
    
    /**
     * Does fly.
     */  
    public void fly() {
        System.out.println("I must fly fast and low to avoid eagles!");
    }
    
    /**
     * Does run.
     */  
    public void run() {
        System.out.println("Watch me run with my winds wide open for balance!");
    }
    

}
