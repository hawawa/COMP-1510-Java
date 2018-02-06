/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Represents a Yorkshire which includes color and weight.
 * Extends Dog. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Yorkshire extends Dog {
    /** Ratter or not. */
    private boolean ratter;
    /** Weight. */
    private final int YORKSHIRE_WEIGHT = 4;
    
    /**
     * Constructs a yorkshire by defining name and if it is a ratter.
     * Its color should not be null or only white space.
     * @param name
     *            a string for dog's name
     * @param ratter
     *            a boolean for if it is a ratter
     */ 
    public Yorkshire(String name, boolean ratter) {
        super(name);
        this.ratter = ratter;
    }
    
    /**
     * Accessor for if it is a ratter.
     * @return boolean as if it is a ratter
     */
    public boolean isRatter() {
        return ratter;
    }
    
    /**
     * Return its speak sound.
     * @return String as sound.
     */
    @Override
    public String speak() {
        return "YAPYAPYAP";
    }
    
    /**
     * Accessor for dog's average breed weight in KG.
     * @return boolean as dog's average breed weight in KG
     */
    @Override
    public double averageBreedWeightKG() {
        return YORKSHIRE_WEIGHT;
    }
    
    /**
     * Returns a String representation of this yorkshire.
     * @return String representation of this yorkshire.
     */
    @Override
    public String toString() {
        return "Yorkshire [ratter=" + ratter 
                + ", YORKSHIRE_WEIGHT=" + YORKSHIRE_WEIGHT + "]";
    }
    
    /**
     * Checks if two Yorkshire objects are equal.
     * @param other another Object.
     * @return boolean 
     *          If they are equal, return true.
     *          If they are not equal, return false.
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (this == other) {
            return true;
        } else if (!getClass().equals(other.getClass())) {
            return false;
        } else {
            return this.getName().equals(((Yorkshire) other).getName()) 
                    && this.isRatter() == ((Yorkshire) other).isRatter();
        }
            
    }


    

}
