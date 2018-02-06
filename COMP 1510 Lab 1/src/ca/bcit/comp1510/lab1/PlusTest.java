/**
 * 
 */
package ca.bcit.comp1510.lab1;

/**
 * Demonstrates the different behaviours of the + operator.
 * 
 * @author Chang, Chih-Hsi
 * @version 2017-09-14
 */
public class PlusTest {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("This is a long string that is the" +
                " concatenation of two shorter strings.");
        System.out.println("The first computer was invented about " + 70 +
                " years ago");
        
        // because the fist item is string, 8 and 5 are also identified to string.
        System.out.println ("8 plus 5 is " + 8 + 5);
        
        // because in the parentheses, 8 and 5 are numbers, they plus together first.
        System.out.println ("8 plus 5 is " + (8 + 5));
        
        //because 8 and 5 are both numbers, they plus together first.
        System.out.println (8 + 5 + " equals 8 plus 5.");

    }

}
