/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Represents a Labrador which includes color and weight.
 * Extends Dog. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Labrador extends Dog {
    /** Weight. */
    private static final int LABRADOR_WEIGHT = 35;
    /** Color. */
    private String color;
    
    
    /**
     * Constructs a labrador by defining name and color.
     * Its color should not be null or only white space.
     * @param name
     *            a string for dog's name
     * @param color
     *            a string for dog's color
     */   
    public Labrador(String name, String color) {
        super(name);
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("The Dog's color "
                    + "should not be null or whitespace!");
        } else {
            this.color = color;
        }
        
    }
    
    /**
     * Accessor for dog's color.
     * @return String as dog's color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Accessor for dog's average breed weight in KG.
     * @return dobule as dog's average breed weight in KG
     */
    @Override
    public double averageBreedWeightKG() {
        return LABRADOR_WEIGHT;
    }
    
    /**
     * Return its speak sound.
     * @return String as sound.
     */
    @Override
    public String speak() {
        return "BOW WOW";
    }
    
    /**
     * Returns a String representation of this labrador.
     * @return String representation of this labrador.
     */
    @Override
    public String toString() {
        return "Labrador [color=" + color 
                + ", LABRADOR_WEIGHT=" + LABRADOR_WEIGHT + "]";
    }
    
    /**
     * Checks if two Labrador objects are equal.
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
            return this.getName().equals(((Labrador) other).getName()) 
            && this.getColor().equals(((Labrador) other).getColor());
        }    

    }
    
    

}
