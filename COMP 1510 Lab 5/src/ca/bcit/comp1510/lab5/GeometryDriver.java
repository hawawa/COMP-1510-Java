/**
 * 
 */
package ca.bcit.comp1510.lab5;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 * <p>Uses a Scanner to interact with the user and create some shapes.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */

public class GeometryDriver {

    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //2.
        Scanner scan = new Scanner(System.in);
        
        //6.
        DecimalFormat fmt = new DecimalFormat("$0.###");

        //3.Sphere
        System.out.println("Please enter the x-coordinate,"
                + " y-coordinate, z-coordinate,"
                + " and radius for a sphere by order: ");
        Sphere sphere = new Sphere(scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble());
        System.out.println("The surface of the sphere: " 
                + fmt.format(sphere.surfaceArea()) + "\n"
                + "The volume of the sphere: " 
                + fmt.format(sphere.volume()));
        //4.Cube
        System.out.println("Please enter the x-coordinate,"
                + " y-coordinate, z-coordinate,"
                + " and the edge length for a cube by order: ");
        Cube cube = new Cube(scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble());
        System.out.println("The surface of the cube: " 
                + fmt.format(cube.surfaceArea()) + "\n"
                + "The volume of the cube: " 
                + fmt.format(cube.volume()) + "\n"
                + "The face diagonal of the cube: " 
                + fmt.format(cube.faceDiagonal()) + "\n"
                + "The space diagonal of the cube: " 
                + fmt.format(cube.spaceDiagonal()) + "\n");
        
        //5.Cone
        System.out.println("Please enter the radius and height "
                + "for a right circular cone by order: ");
        Cone cone = new Cone(scan.nextDouble(), scan.nextDouble());
        System.out.println("The volume of the cube: " 
                + fmt.format(cone.volume()) + "\n"
                + "The slant height of the cube: " 
                + fmt.format(cone.slantHeight()) + "\n"
                + "The surface area of the cube: " 
                + fmt.format(cone.surfaceArea()));
        
        //7.Challenge
        NumberFormat fmtC = NumberFormat.getInstance();
        final int digits = 3;
        fmtC.setMaximumFractionDigits(digits);
        System.out.println("Challenge Question!!!");
        System.out.println("Please enter the radius and height "
                + "for a right circular cone by order: ");
        Cone coneC = new Cone(scan.nextDouble(), scan.nextDouble());
        System.out.println("The volume of the cube: " 
                + fmtC.format(coneC.volume()) + "\n"
                + "The slant height of the cube: " 
                + fmtC.format(coneC.slantHeight()) + "\n"
                + "The surface area of the cube: " 
                + fmtC.format(coneC.surfaceArea()));
        
        scan.close();


    }

}
