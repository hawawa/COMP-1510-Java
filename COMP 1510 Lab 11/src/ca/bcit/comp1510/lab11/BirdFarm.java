/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Tests some interfaces and some classes about bird.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class BirdFarm {

    /**
     * Creates several birds and tests the functions.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final int bird1Age = 5;
        final int bird2Age = 6;
        final int bird3Age = 7;
        Ostrich bird1 = new Ostrich(bird1Age, "white");
        Penguin bird2 = new Penguin(bird2Age, "white");
        Cormorant bird3 = new Cormorant(bird3Age, "white");
        
        System.out.println("Ostrich:");
        bird1.move();
        System.out.println("");
        
        System.out.println("Penguin:");
        bird2.move();
        System.out.println("");
        
        System.out.println("Cormorant:");
        bird3.move();
        System.out.println("");

    }

}
