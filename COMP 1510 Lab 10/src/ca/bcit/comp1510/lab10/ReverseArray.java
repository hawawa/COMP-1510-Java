/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p>
 * Reverses an integer Array which is input by user.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class ReverseArray {
    /** Holding an integer Array. */
    private static int[] intArray;
    
    /**
     * Swaps the elements in the Array.
     */
    private static void swap() {
        int temp1;
        int temp2;
        
        for (int i = 0; i < intArray.length / 2; i++) {
            temp1 = intArray[i];
            temp2 = intArray[intArray.length - i - 1];
            intArray[i] = temp2;
            intArray[intArray.length - i - 1] = temp1;
        }
                
    }
    
    
    
    /**
     * Reverse the elements of the Array.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        
        boolean end = false;
        while (!end) {
            scan = new Scanner(System.in);
            
            try {
                System.out.println("Please enter a pasitive integer for "
                        + "how many values you want to enter:");
                number = scan.nextInt();
                end = true;
                if (number <= 0) {
                    System.out.println("Enter should be greater than 0!");
                    end = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!!");
            }
               
        }

        
        intArray = new int[number];
        for (int i = 0; i < number; i++) {
            end = false;
            while (!end) {
                scan = new Scanner(System.in);
                
                try {
                    System.out.println("Please enter No." 
                            + (i + 1) + " value:");
                    intArray[i] = scan.nextInt();
                    end = true;
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input! Please enter a integer!!");
                }
                   
            }
      
        }
        
        System.out.println("The array you enter is:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        swap();
        System.out.println("");
        System.out.println("The reverse array is:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        scan.close();
        
    }

}
