/**
 * 
 */
package ca.bcit.comp1510.lab9;
import java.util.Random;
import java.util.Scanner;

/**
 * <p>
 * Simulates a drunk walker.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class DrunkWalker {

    /**
     * Runs a simulation by entering boundary, steps, and how many drunks.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Please enter the boundary");
        int boundary = scan.nextInt();
        System.out.println("Please enter the steps");
        int maxSteps = scan.nextInt();
        System.out.println("Please enter how many drunks");
        int drunks = scan.nextInt();
        int falls = 0;
                
        for (int i = 1; i <= drunks; i++) {
            int currentX = 0;
            int currentY = 0;
            int steps = 0;
            
            while ((currentX <= boundary && currentX >= -boundary 
                    && currentY <= boundary && currentY >= -boundary) 
                    && steps <= maxSteps) {
                final int directions = 4;
                char move = (char) ('A' + generator.nextInt(directions));
                        
                switch (move) {
                case 'A':
                    currentX++;
                    break;
                case 'B':
                    currentY++;
                    break;
                case 'C':
                    currentX--;
                    break;
                case 'D':
                    currentY--;
                    break;
                default:
                }
                steps++;
               
            }
            if (steps <= maxSteps) {
                falls++;
            }
               
        }
        
        System.out.println("The total number of tests:" + drunks);
        System.out.println("The number of falls:" + falls);
        scan.close();
        

    }

}
