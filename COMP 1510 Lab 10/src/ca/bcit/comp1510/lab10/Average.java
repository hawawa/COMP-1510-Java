/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * <p>
 * Calculates the average.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Average {

    /**
     * Uses command to input the number to be calculated.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int notI = 0;
        double sum = 0.0;
        while (args.length != i  && args[i] != null) {
            System.out.println(args[i]);
            
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("The No." + (i + 1) 
                        + " argument is not an integer.");
                notI++;
            }
            
            i++;
        }
        if (i == 0) {
            System.out.println("No arguments!");
        } else if (i - notI == 0) {
            System.out.println("No validated arguments!");
        } else {
            System.out.println("The average is: " + sum / (i - notI));
        }
        
    }

}
