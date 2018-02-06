/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * Represents a paint can which includes coverage. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class PaintCan {
    /** Coverage. */
    private double coverage;
    
    /**
     * Constructs a paint can by defining coverage.
     * Its coverage should be greater than 0.
     * @param coverage
     *            a double for coverage
     */ 
    public PaintCan(double coverage) {
        if (coverage > 0) {
            this.coverage = coverage;
        } else {
            throw new IllegalArgumentException(
                    "The coverage should be greater than 0.");
        }
    }
    
    /**
     * Returns the number of cans needed to paint the surface area.
     * @param shape
     *            a shape for painting
     * @return double as the number of cans
     */
    public double amount(Shape shape) {
        return shape.surfaceArea() / coverage;
    }

}
