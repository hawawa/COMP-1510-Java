package q3;
import java.text.DecimalFormat;

/**
 * <p>
 * Define a Cylinder object.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Cylinder {
    /** Hold the radius of the cylinder. */
    private double radius;
    /** Hold height of the cylinder. */
    private double height;
    /** Create a format for the results. */
    private DecimalFormat fmt = new DecimalFormat("0.####");
    
    //constructor
    /** 
     * Constructor inputs radius and height of the cylinder.
     *  @param radius 
     *          a double for radius
     *  @param height
     *          a double for height
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    //getter
    /**
     * Returns the radius of cylinder as a double.
     * @return radius as a double
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Returns the radius of cylinder as a double.
     * @return radius as a double
     */
    public double getHeight() {
        return height;
    }
    
    //setter
    /**
     * Sets the radius of cylinder to the specified value.
     * @param radius as a double
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * Sets the radius of cylinder to the specified value.
     * @param height as a double
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    //methods
    /**
     * Returns the surface area of the cylinder as a double.
     * @return the value of the surface area as a double
     */ 
    public String surfaceArea() {
        return fmt.format(2 * Math.PI * radius * (radius + height));
    }
    /**
     * Returns the volume of the cylinder as a double.
     * @return the value of volume as a double
     */ 
    public String volume() {
        return fmt.format(Math.PI * Math.pow(radius, 2) * height);
    }
    /**
     * Returns a String representation of this Cylinder.
     * @return toString description containing radius and height.
     */   
    public String toString() {
        return "The radius and the height of the cylinder are " 
                + radius + " and " + height + ".";
    }

};
