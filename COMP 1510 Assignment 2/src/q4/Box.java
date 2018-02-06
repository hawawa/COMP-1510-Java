package q4;

/**
 * <p>
 * Define a Box object.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Box {
    /** Hold the height of the cylinder. */
    private double height;
    /** Hold the width of the cylinder. */
    private double width;
    /** Hold the depth of the cylinder. */
    private double depth;
    /** Hold the answer of if it is full. */
    private boolean full;
    
    //constructor
    /** 
     * Constructor inputs height, width and height of the box.
     *  @param height 
     *          a double for height
     *  @param width
     *          a double for width
     *  @param depth
     *          a double for depth
     */
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }
    
    //getter
    /**
     * Returns the height of box as a double.
     * @return height as a double
     */
    public double getHeight() {
        return height;
    }
    /**
     * Returns the width of box as a double.
     * @return width as a double
     */
    public double getWidth() {
        return width;
    }
    /**
     * Returns the depth of box as a double.
     * @return depth as a double
     */
    public double getDepth() {
        return depth;
    }
    /**
     * Returns the answer of if the box is full as a boolean.
     * @return full as a boolean
     */
    public boolean getFull() {
        return full;
    }
    
    //setter
    /**
     * Sets the height of box to the specified value.
     * @param height as a double
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * Sets the width of box to the specified value.
     * @param width as a double
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Sets the depth of box to the specified value.
     * @param depth as a double
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }
    /**
     * Sets the answer of if the box is full.
     * @param full as a boolean
     */
    public void setFull(boolean full) {
        this.full = full;
    }
    
    //method
    /**
     * Returns a String representation of this Box.
     * @return toString description containing 
     * height, width, depth and if it is full.
     */ 
    public String toString() {
        return "The height, width and depth of the box are " 
    + height + ", " + width + ", " + depth + ", and its full is " + full;
    }
    
};
