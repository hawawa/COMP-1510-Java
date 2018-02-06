/**
 * 
 */
package ca.bcit.comp1510.lab9;

/**
 * <p>
 * Simulates two particles in one space 
 * and calculates how many times they collide.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Collisions {

    /**
     * Creates two particles and simulates they are moving.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final int firstXCoordinat = -3;
        final int firstYcoordinate = 0;
        final int secondXCoordinat = 3;
        final int secondYcoordinate = 0;
        final int boundary = 2000000;
        final int maximumSteps = 100000;
        RandomWalker particle1 = new RandomWalker(firstXCoordinat,
                firstYcoordinate, maximumSteps, boundary);
        RandomWalker particle2 = new RandomWalker(secondXCoordinat,
                secondYcoordinate, maximumSteps, boundary);
        int collisions = 0;
        for (int i = 1; i <= maximumSteps; i++) {
            particle1.takeStep();
            particle2.takeStep();
            if (samePosition(particle1, particle2)) {
                collisions++;
            }
        }
        
        System.out.println("Collisions:" + collisions);
        
        //The farthest distance a particle gets with these settings is 100003.
        
    }
    
    /**
     * Checks if they are in the same position.
     * @param rw1
     *            first RandomWalker
     * @param rw2
     *            second RandomWalker
     * @return boolean represents they are collided.
     */
    public static boolean samePosition(RandomWalker rw1, RandomWalker rw2) {
        return rw1.getCurrentX() == rw2.getCurrentX() 
                && rw1.getCurrentY() == rw2.getCurrentY();
    }

}
