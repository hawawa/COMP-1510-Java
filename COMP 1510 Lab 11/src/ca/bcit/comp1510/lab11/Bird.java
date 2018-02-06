/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * A abstract class which represents an bird 
 * which includes feather colour. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public abstract class Bird extends Animal {
    /** Color. */
    protected String featherColour;
  
    /**
     * Constructs a bird by defining age and feather colour.
     * @param age
     *            a integer for bird's age
     * @param featherColour
     *            a string for bird's feather colour
     */  
    public Bird(int age, String featherColour) {
        super(age);
        this.featherColour = featherColour;
    }

}
