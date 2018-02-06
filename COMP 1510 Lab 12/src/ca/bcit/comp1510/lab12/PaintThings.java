/**
 * 
 */
package ca.bcit.comp1510.lab12;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p>
 * Paint some shapes.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class PaintThings {

    /**
     * Creates several shape objects 
     * and calculates the number of paint can you needed.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat  df = new DecimalFormat("#.##");
        System.out.println("Please enter "
                + "how much coverage a can will provide:");
        PaintCan myPaintCan = new PaintCan(scan.nextDouble());
        System.out.println("Please enter the radius of the sphere:");
        Sphere mySphere = new Sphere(scan.nextDouble());
        System.out.println("Please enter the side length of the cube:");
        Cube myCube = new Cube(scan.nextDouble());
        System.out.println("Please enter the radius of the cylinder:");
        double cylinderRadius = scan.nextDouble();
        System.out.println("Please enter the height of the cylinder:");
        double cylinderHeight = scan.nextDouble();
        Cylinder myCylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("You need " 
                + df.format(myPaintCan.amount(mySphere)) 
                + " can(s) for the sphere.");
        System.out.println("You need " 
                + df.format(myPaintCan.amount(myCube)) 
                + " can(s) for the cube.");
        System.out.println("You need " 
                + df.format(myPaintCan.amount(myCylinder)) 
                + " can(s) for the cylinder.");
        System.out.println("Total is " 
                + df.format(myPaintCan.amount(mySphere) 
                + myPaintCan.amount(myCube) 
                + myPaintCan.amount(myCylinder)) 
                + " can(s).");
        
        scan.close();
    }

}
