/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Represents a two-dimension matrix. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Matrix {
    /** Two-dimension matrix. */
    private int[][] matrix;
    
    /**
     * Constructs a matrix by defining size.
     * @param r
     *            a integer for the number of row
     * @param c
     *            a integer for the number of column
     */ 
    public Matrix(int r, int c) {
        matrix = new int[r][c];
    }
    
    /**
     * Accessor for the number of row.
     * @return integer as the number of row
     */
    public int getRows() {
        return matrix.length;
    }
    
    /**
     * Accessor for the number of column.
     * @return integer as the number of column
     */
    public int getColumns() {
        return matrix[0].length;
    }
    
    /**
     * Returns the value of specific element.
     * @param r
     *            the row
     * @param c
     *            the column
     * @return integer 
     *              The value of specific element
     */
    public int getValue(int r, int c) {
        return matrix[r][c];
    }
    
    /**
     * Sets the value of specific element.
     * @param value
     *            the value
     * @param r
     *            the row
     * @param c
     *            the column
     */
    public void setValue(int value, int r, int c) {
        matrix[r][c] = value;
    }
    
    /**
     * Returns a String representation of this matrix.
     * @return String representation of this matrix.
     */
    public String toString() {
        String result = "";
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result = result + matrix[i][j] + "\t";
            }
            result = result + "\n";
            
        }
                
        return result;
    }
    
    /**
     * Add two matrixes.
     * @param otherMatrix another matrix.
     * @return Matrix 
     *          The result of adding
     */
    public Matrix add(Matrix otherMatrix) {
        if (otherMatrix.getRows() != this.getRows() || otherMatrix.getColumns() 
                != this.getColumns()) {
            throw new 
            IllegalArgumentException("The sizes of matrixs are not match!");
        } else {
            Matrix newMatrix = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    newMatrix.setValue(this.getValue(i, j) 
                            + otherMatrix.getValue(i, j), i, j);
                }
            }
            return newMatrix;
        }
    }
    
    
    

}
