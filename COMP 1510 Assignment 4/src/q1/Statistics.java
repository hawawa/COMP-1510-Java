package q1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p>
 * Calculates the mean and standard deviation of input numbers.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Statistics {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int maxNumbers = 50;
        int[] numbers = new int[maxNumbers];
        int sum = 0;
        int count = 0;
        
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(scan.nextLine());
        int i = 0;
        
        while (scan2.hasNext()) {
            
            numbers[i] = scan2.nextInt();
            sum += numbers[i];
            count++;
            i++;
        }
        
        double mean = (double) sum / count;
        
        
        double ssd = 0.0;
        for (int j = 0; j < count; j++) {
            ssd += Math.pow((numbers[j] - mean), 2);
        }
        double sd; 
        if (count == 1) {
            sd = 0.0;
        } else {
            sd = Math.sqrt(ssd / (count - 1));
        }
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Mean:\n" + df.format(mean));
        System.out.println("Standard deviation:\n" + df.format(sd));
        
        scan.close();
        scan2.close();
        System.out.println("Question one was called and ran sucessfully.");
    }

}
