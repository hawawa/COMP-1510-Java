/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Tests Matrix objects.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class MatrixDriver {

    /**
     * Creates several Matrix objects and tests the functions.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final int matrixRow = 2;
        final int matrixColumn = 2;
        final int matrixColumnNew = 3;
        
        Matrix matrix1 = new Matrix(matrixRow, matrixColumn);
        final int[] matrix1Value = {2, 3, 4, 5};
        for (int i = 0; i < matrixRow * matrixColumn;) {
            for (int j = 0; j < matrixRow; j++) {
                for (int k = 0; k < matrixColumn; k++) {
                    matrix1.setValue(matrix1Value[i], j, k);
                    i++;
                }
            }
        }
        System.out.println("First matrix:\n" + matrix1.toString());
        
        Matrix matrix2 = new Matrix(matrixRow, matrixColumn);
        final int[] matrix2Value = {1, 2, 3, 4};
        for (int i = 0; i < matrixRow * matrixColumn;) {
            for (int j = 0; j < matrixRow; j++) {
                for (int k = 0; k < matrixColumn; k++) {
                    matrix2.setValue(matrix2Value[i], j, k);
                    i++;
                }
            }
        }
        System.out.println("Second matrix:\n" + matrix2.toString());
        
        Matrix matrix3 = matrix1.add(matrix2);
        System.out.println("Third matrix:\n" + matrix3.toString());
        
        
        Matrix matrixR =  new Matrix(matrixRow, matrixColumnNew);
        final int[] matrixRValue = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < matrixRow * matrixColumnNew;) {
            for (int j = 0; j < matrixRow; j++) {
                for (int k = 0; k < matrixColumnNew; k++) {
                    matrixR.setValue(matrixRValue[i], j, k);
                    i++;
                }
            }
        }
        System.out.println("Rectangular matrix:\n" + matrixR.toString());
        
        try {
            matrixR.add(matrix1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        

    }

}
