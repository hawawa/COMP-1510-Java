/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * Represents a cylinder which includes radius and height.
 * Extends Shape. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Cylinder extends Shape {
    /** Radius. */
    private double radius;
    /** Height. */
    private double height;
    
    /**
     * Constructs a cylinder by defining radius and height.
     * Its radius and height should be both greater than 0.
     * @param radius
     *            a double for cylinder's radius
     * @param height
     *            a double for cylinder's height
     */ 
    public Cylinder(double radius, double height) {
        super.setName("Cylinder");
        if (radius > 0 && height > 0) {
            this.radius = radius;
            this.height = height;
        } else {
            throw new IllegalArgumentException(
                    "The radius and height should both be greater than 0.");
        }
        
    }
    
    /**
     * Returns the surface area.
     * @return double as the surface area.
     */
    public double surfaceArea() {
        return 2 * Math.PI * radius * height 
                + 2 * Math.pow(radius, 2) * Math.PI;
    }
    
    /**
     * Returns a String representation of this cylinder.
     * @return String representation of this cylinder.
     */
    public String toString() {
        String result = super.toString() + "\n";
        result += "The radius is: " + radius + "\n";
        result += "The height is: " + height;
        return result;
    }

}
