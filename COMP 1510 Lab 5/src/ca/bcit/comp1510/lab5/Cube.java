/**
 * 
 */
package ca.bcit.comp1510.lab5;

/**
 * <p>Represents a cube with basic information,
 *  such as surface area and value.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Cube {
    /** Holds the X coordinate of the cube. */
    private double coordinateX;
    /** Holds the Y coordinate of the cube. */
    private double coordinateY;
    /** Holds the Z coordinate of the cube. */
    private double coordinateZ;
    /** Holds the edge length of the cube. */
    private double edgeLength;
    //constructor
    /** Constructor inputs 3 coordinates and edge length of the cube.
     *  @param coordinateX 
     *          a double for x coordinate
     *  @param coordinateY
     *          a double for y coordinate
     *  @param coordinateZ
     *          a double for z coordinate
     *  @param edgeLength
     *          a double for edge length
     */
    public Cube(double coordinateX, double coordinateY,
            double coordinateZ, double edgeLength) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.edgeLength = edgeLength;
    }
    
    //getters and setters
    /**
     * Returns the x coordinate of cube as a double.
     * @return coordinateX as a double
     */
    public double getCoordinateX() {
        return coordinateX;
    }
    
    /**
     * Sets the x coordinate of cube to the specified value.
     * @param coordinateX as a double
     */
    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }
    
    /**
     * Returns the y coordinate of cube as a double.
     * @return coordinateY as a double
     */
    public double getCoordinateY() {
        return coordinateY;
    }
    
    /**
     * Sets the y coordinate of cube to the specified value.
     * @param coordinateY as a double
     */
    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
    
    /**
     * Returns the z coordinate of cube as a double.
     * @return coordinateZ as a double
     */
    public double getCoordinateZ() {
        return coordinateZ;
    }
    
    /**
     * Sets the z coordinate of cube to the specified value.
     * @param coordinateZ as a double
     */
    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }
    
    /**
     * Returns the edge length of cube as a double.
     * @return edgeLength as a double
     */
    public double getEdgeLength() {
        return edgeLength;
    }
    
    /**
     * Sets the edge length of cube to the specified value.
     * @param edgeLength as a double
     */
    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    //method
    /**
     * Returns a String representation of this Cube.
     * @return toString description containing 3 coordinates and edge length.
     */
    public String toString() {
        return "X-coordinate: " + coordinateX + "\n"
               + "Y-coordinate: " + coordinateY + "\n"
               + "Z-coordinate: " + coordinateZ + "\n"
               + "Edge length: "  + edgeLength;
    }
    
    /**
     * Returns the surface area of cube as a double.
     * @return the value of surface area as a double
     */ 
    public double surfaceArea() {
        final double coefficient = 6.0;
        final int power = 2;
        return coefficient * Math.pow(edgeLength, power);
    }
    
    /**
     * Returns the volume of cube as a double.
     * @return the value of volume as a double
     */ 
    public double volume() {
        final int power = 3;
        return Math.pow(edgeLength, power);
    }
    
    /**
     * Returns the volume of cube as a double.
     * @return the value of volume as a double
     */ 
    public double faceDiagonal() {
        final double coefficient = Math.sqrt(2);
        return  coefficient * edgeLength;
    }

    /**
     * Returns the volume of cube as a double.
     * @return the value of volume as a double
     */ 
    public double spaceDiagonal() {
        final double coefficient = Math.sqrt(3);
        return coefficient * edgeLength;
    }
    
    
}
