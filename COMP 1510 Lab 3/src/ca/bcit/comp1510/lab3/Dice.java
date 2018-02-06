/**
 * 
 */
package ca.bcit.comp1510.lab3;
import java.util.Random;
/**
 * Simulating the rolling of a collection of D&D dice.
 * @author Chih-Hsi Chang
 * @version 2017-09-26
 *
 */
public class Dice {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Random generator = new Random();
        int dieof4Side = generator.nextInt(4) + 1;
        int dieof6Side = generator.nextInt(6) + 1;
        int dieof8Side = generator.nextInt(8) + 1;
        int dieof10Side = generator.nextInt(10) + 1;
        int dieof12Side = generator.nextInt(12) + 1;
        int dieof20Side = generator.nextInt(20) + 1;
        System.out.println("4-sided die: " + dieof4Side);
        System.out.println("6-sided die: " + dieof6Side);
        System.out.println("8-sided die: " + dieof8Side);
        System.out.println("10-sided die: " + dieof10Side);
        System.out.println("12-sided die: " + dieof12Side);
        System.out.println("20-sided die: " + dieof20Side);
        System.out.println("Total is " 
        + (dieof4Side + dieof6Side + dieof8Side 
                + dieof10Side + dieof12Side + dieof20Side) 
                + ".");
        
    }

}
