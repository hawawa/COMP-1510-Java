/**
 * 
 */
package ca.bcit.comp1510.lab5;

/**
 * <p>Represents a cone with basic information,
 *  such as surface area and value.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */

public class Cone {
    /** Holds the radius of the cone. */
    private double radius;
    /** Holds the height of the cone. */
    private double height;
    
    //constructor
    /** Constructor inputs 3 coordinates and edge length of the cone.
     *  @param radius 
     *          a double for radius
     *  @param height
     *          a double for height
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;       
    }

    //getters and setters
    /**
     * Returns the radius of cone as a double.
     * @return radius as a double
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of cone to the specified value.
     * @param radius as a double
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the height of cone as a double.
     * @return height as a double
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of cone to the specified value.
     * @param height as a double
     */
    public void setHeight(double height) {
        this.height = height;
    }

    //method
    /**
     * Returns the volume of cone as a double.
     * @return the value of volume as a double
     */ 
    public double volume() {
        final double coefficient = 1.0 / 3.0;
        final int power = 2;
        return coefficient * Math.PI * Math.pow(radius, power) * height;
    }
     
    /**
     * Returns the slant height of cone as a double.
     * @return the value of slant height as a double
     */ 
    public double slantHeight() {
        final int power = 2;
        return Math.sqrt(Math.pow(radius, power) + Math.pow(height, power));
    }
    
    /**
     * Returns the surface area of cone as a double.
     * @return the value of surface area as a double
     */ 
    public double surfaceArea() {
        final int power = 2;
        return Math.PI * Math.pow(radius, power)
                + Math.PI * radius * Math.sqrt(Math.pow(radius, power) 
                        + Math.pow(height, power));
    }
    
    /**
     * Returns a String representation of this Cone.
     * @return toString description containing radius and height.
     */
    public String toString() {
        return "Radius: " + radius + "\n"
                + "Height: " + height;
    }
    
}
