package q3;

import java.util.Scanner;

/**
 * <p>
 * Creates two Cylinder objects.
 * First one inputs the values by coding.
 * Second one inputs the values by user.
 *    </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final double firstRadius = 5.0;
        final double firstHeight = 10.0;
        Cylinder cylinder1 = new Cylinder(firstRadius, firstHeight);
        System.out.println("The first cylinder:");
        System.out.println("Before modification: the radius is " 
        + cylinder1.getRadius() + ", the height is " + cylinder1.getHeight());
        final double firstNewRadius = 2.0;
        final double firstNewHeight = 5.0;
        cylinder1.setRadius(firstNewRadius);
        cylinder1.setHeight(firstNewHeight);
        System.out.println("After modification: " + cylinder1.toString());
        System.out.println("The volume and surface area are " 
        + cylinder1.volume() + " and " + cylinder1.surfaceArea());
        
        Scanner scan = new Scanner(System.in);
        final double secondRadius = 3.0;
        final double secondHeight = 7.5;
        Cylinder cylinder2 = new Cylinder(secondRadius, secondHeight);
        System.out.println("The second cylinder:");
        System.out.println("Before modification: the radius is " 
        + cylinder2.getRadius() + ", the height is " + cylinder2.getHeight());
        System.out.println("Please enter the new radius "
                + "for the second cylinder:");
        cylinder2.setRadius(scan.nextDouble());
        System.out.println("Please enter the new height "
                + "for the second cylinder:");
        cylinder2.setHeight(scan.nextDouble());
        System.out.println("After modification: " + cylinder2.toString());
        System.out.println("The volume and surface area are " 
        + cylinder2.volume() + " and " + cylinder2.surfaceArea());
        scan.close();
        
        System.out.println("Question three was called and ran sucessfully.");
    }

};
