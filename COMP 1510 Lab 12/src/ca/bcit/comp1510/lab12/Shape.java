/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * A abstract class which represents a shape 
 * It includes name and a surface area method. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public abstract class Shape {
    /** Shape's name. */
    private String name;
    
    /**
     * Accessor for shape's name.
     * @return String as shape's name
     */
    public String getName() {
        return name;
    }

    /**
     * Mutator for the shape's name.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the surface area.
     * @return double as the surface area.
     */
    public abstract double surfaceArea();
    
    /**
     * Returns a String representation of this shape.
     * @return String representation of this shape.
     */
    public String toString() {
        return "The name of this shape is " + name + " .";
    }

}
