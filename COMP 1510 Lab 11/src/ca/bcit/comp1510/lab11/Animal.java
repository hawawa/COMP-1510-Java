/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * A abstract class which represents an animal 
 * which includes name and some methods. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public abstract class Animal {
    /** Animal's age. */
    protected int age;
    
    /**
     * Constructs an animal by defining age.
     * @param age
     *            a integer for its age
     */ 
    public Animal(int age) {
        this.age = age;
    }
    
    /**
     * Does eat.
     */
    abstract void eat();
    
    /**
     * Does move.
     */
    abstract void move();
    

}
