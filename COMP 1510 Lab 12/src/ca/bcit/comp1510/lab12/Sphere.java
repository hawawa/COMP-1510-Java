/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * Represents a sphere which includes radius.
 * Extends Shape. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Sphere extends Shape {
    /** Radius. */
    private double radius;
    
    /**
     * Constructs a sphere by defining radius.
     * Its radius should be greater than 0.
     * @param radius
     *            a double for sphere's radius
     */  
    public Sphere(double radius) {
        super.setName("Sphere");
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new 
            IllegalArgumentException("The radius should be greater than 0!");
        }
        
    }
    
    /**
     * Returns the surface area.
     * @return double as the surface area.
     */
    public double surfaceArea() {
        final int four = 4;
        return four * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * Returns a String representation of this sphere.
     * @return String representation of this sphere.
     */
    public String toString() {
        String result = super.toString() + "\n";
        result += "The radius is: " + radius;
        return result;
    }

}
