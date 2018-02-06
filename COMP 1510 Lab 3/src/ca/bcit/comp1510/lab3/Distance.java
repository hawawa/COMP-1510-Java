/**
 * 
 */
package ca.bcit.comp1510.lab3;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Calculating the distance between two pints.
 * @author Chih-Hsi Chang
 * @version 2017-09-26
 *
 */
public class Distance {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter x and y value "
                + "of the first point seperating by space.");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Please enter x and y value "
                + "of the second point seperating by space.");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double result = 
                Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("The distance between these two point is "
                + result + ".");
        
        //7. It works for points in all 4 quadrants. 
        
        DecimalFormat dF = new DecimalFormat("#.##");
        String formatedResult = dF.format(result);
        System.out.println("The formated distance is " + formatedResult + ".");
        
        scan.close(); 
    }

}
