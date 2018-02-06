/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Represents a ostrich.
 * Extends Bird.
 * Implements Terrestrial. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Ostrich extends Bird implements Terrestrial {
    /**
     * Constructs a ostrich by defining age and feather colour.
     * @param age
     *            a integer for ostrich's age
     * @param featherColour
     *            a string for ostrich's feather colour
     */  
    public Ostrich(int age, String featherColour) {
        super(age, featherColour);
        
    }

    /**
     * Does eat.
     */  
    @Override
    public void eat() {
        System.out.println("Watch me gobble up these lizards yum yum!");
        
    }
    
    /**
     * Does move.
     */  
    @Override
    public void move() {
        run();
        
    }
    
    /**
     * Does run.
     */  
    @Override
    public void run() {
        System.out.println("Look at how fast I lope across the savannah!");
        
    }


}
