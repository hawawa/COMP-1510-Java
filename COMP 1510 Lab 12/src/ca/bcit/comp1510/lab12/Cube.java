/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * Represents a cube which includes side length.
 * Extends Shape. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Cube extends Shape {
    /** Side length. */
    private double sideLength;
    
    /**
     * Constructs a cube by defining side length.
     * Its side length should be greater than 0.
     * @param sideLength
     *            a double for cube's side length
     */  
    public Cube(double sideLength) {
        super.setName("Cube");
        if (sideLength > 0) {
            this.sideLength = sideLength;
        } else {
            throw new IllegalArgumentException(
                    "The side length should be greater than 0.");
        }
    }
    
    /**
     * Returns the surface area.
     * @return double as the surface area.
     */
    public double surfaceArea() {
        final int six = 6;
        return six * Math.pow(sideLength, 2);
    }
    
    /**
     * Returns a String representation of this cube.
     * @return String representation of this cube.
     */
    public String toString() {
        String result = super.toString() + "\n";
        result += "The side length is: " + sideLength;
        return result;
    }

}
