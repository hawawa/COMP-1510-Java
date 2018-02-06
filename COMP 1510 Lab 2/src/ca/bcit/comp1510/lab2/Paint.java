/**
 * 
 */
package ca.bcit.comp1510.lab2;
//3.
import java.util.Scanner;
/**
 * Calculate how many cans of paint we need to paint a room.
 * @author Chih-Hsi Chang
 * @version 2017-09-19
 */
public class Paint {

    /**
     * Make a useful tool.
     * @param args unused
     */
    public static void main(String[] args) {
        //2.
        final int COVERAGE=400;
        //4.
        Scanner myScanner =new Scanner(System.in);
        //5.
        System.out.println("Please enter the length in feet for the room.");
        double length;
        length = myScanner.nextDouble();        
        //6.
        System.out.println("Please enter the width in feet for the room.");
        double width;
        width = myScanner.nextDouble();        
        //7.
        System.out.println("Please enter the height in feet for the room.");
        double height;
        height = myScanner.nextDouble();
        //8.
        System.out.println("Please enter the number of coats you want to paint.");
        double coats;
        coats = myScanner.nextDouble();
        //9.
        double surfaceArea;
        surfaceArea = length * width + length * height * 2 + width * height *2;
        //10.
        double coverageNeeded;
        coverageNeeded = surfaceArea * coats;
        //11.
        double cansOfPaintNeeded;
        cansOfPaintNeeded = coverageNeeded / COVERAGE;
        //12.
        System.out.println("You should buy " + cansOfPaintNeeded + " Cans of paint.");
        
        myScanner.close();

    }

}
