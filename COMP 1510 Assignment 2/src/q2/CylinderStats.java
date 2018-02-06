package q2;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>
 * Creates a cylinder.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.####");
        double radius;
        double height;
        double surfaceArea;
        double volume;
        System.out.println("Please enter the radius of the cylinder:");
        radius = scan.nextDouble();
        System.out.println("Please enter the height of the cylinder:");
        height = scan.nextDouble();
        surfaceArea = 2 * Math.PI * radius * (radius + height);
        volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The surface area of the cylinder is " 
        + fmt.format(surfaceArea) + ".");
        System.out.println("The volume of the cylinder is " 
        + fmt.format(volume) + ".");
        System.out.println("Question two was called and ran sucessfully.");
        scan.close();
    }

};
