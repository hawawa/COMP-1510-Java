package q3;

import java.util.Scanner;

/**
 * <p>Calculates sum, difference,quotient, and product.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Arithmetic {
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //prompt
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        
        //enter numbers
        double num1;
        num1 = scan.nextDouble();
        double num2;
        num2 = scan.nextDouble();

        //calculate
        System.out.println("sum: " + (num1 + num2));
        System.out.println("difference: " + (num1 - num2));
        System.out.println("quotient: " + (num1 / num2));
        System.out.println("product: " + (num1 * num2));
        
        //close scan object
        scan.close();
    }

};
