/**
 * 
 */
package ca.bcit.comp1510.lab9;
import java.util.Scanner;

/**
 * <p>
 * Tests if the RandomWalker class is working properly.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class TestWalker {

    /**
     * Creates three RandomWalker objects and tests their functions.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final int firstMaximumSteps = 10;
        final int firstBoundarySize = 5;
        RandomWalker firstRandomWalker = 
                new RandomWalker(firstMaximumSteps, firstBoundarySize);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the maximum steps:");
        
        int secondMaxSteps = scan.nextInt();
        System.out.println("Please enter the boundary size:");
        int secondBoundary = scan.nextInt();
        RandomWalker secondRandomWalker = 
                new RandomWalker(secondMaxSteps, secondBoundary);
        
        System.out.println("Beginning:");
        System.out.println("First:\n" + firstRandomWalker.toString());
        System.out.println("Second:\n" + secondRandomWalker.toString());
        System.out.println("Moving:");
        final int times = 5;
        for (int i = 1; i <= times; i++) {
            firstRandomWalker.takeStep();
            secondRandomWalker.takeStep();
            System.out.println("First maximum distance:" 
            + firstRandomWalker.getMaximumDistance());
            System.out.println("Second maximum distance:" 
            + secondRandomWalker.getMaximumDistance());
        }
        
        System.out.println("After move:");
        System.out.println("First:\n" + firstRandomWalker.toString());
        System.out.println("Second:\n" + secondRandomWalker.toString());
        
        final int thirdMaximumSteps = 200;
        final int thirdBoundarySize = 10;
        RandomWalker thirdRandomWalker = 
                new RandomWalker(thirdMaximumSteps, thirdBoundarySize);
        System.out.println("Third:");
        System.out.println("Before move:\n" + thirdRandomWalker.toString());
        thirdRandomWalker.walk();
        System.out.println("After move:\n" + thirdRandomWalker.toString());
        
        scan.close();

    }

}
