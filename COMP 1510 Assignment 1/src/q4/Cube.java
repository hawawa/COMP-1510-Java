package q4;

import java.util.Scanner;

/**
 * <p>Calculates cube's volume and surface area.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Cube {
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //prompt and scan
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the cube:");
        int length;
        length = scan.nextInt();
        
        //print the result
        System.out.println("the cube's volume is :" + length * length * length);
        final int side = 6;
        System.out.println("the cube's surface area is :" 
        + length * length * side);
        
        //close scan object
        scan.close();
    }

};
