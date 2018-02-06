/**
 * 
 */
package ca.bcit.comp1510.lab4;
import java.util.Scanner;
/**
 * IntegerWrapper is a program for practice wrapper.
 * @author Chih-Hsi Chang
 * @version 2017-10-04
 */
public class IntegerWrapper {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        //3.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a integer number.");
        Integer originalInput = new Integer(scan.nextLine());
        System.out.println("The number you enter is " + originalInput + " .");
        System.out.println("The original number comverts to base 2 is " 
        + Integer.toBinaryString(originalInput) + " .");
        System.out.println("The original number comverts to base 8 is " 
        + Integer.toOctalString(originalInput) + " .");
        System.out.println("The original number comverts to base 16 is "
        + Integer.toHexString(originalInput) + " .");
        
        //4.
        System.out.println("The maximum possible Java integer values is " 
        + Integer.MAX_VALUE);
        System.out.println("The minimum possible Java integer values is " 
        + Integer.MIN_VALUE);
        
        //5.
        System.out.println("Please enter two integers, one per line.");
        String number1 = scan.next();
        String number2 = scan.next();
        System.out.println("The sum of these two number is "
        + (Integer.parseInt(number1) + Integer.parseInt(number2)));
        
        scan.close();
    }

}
