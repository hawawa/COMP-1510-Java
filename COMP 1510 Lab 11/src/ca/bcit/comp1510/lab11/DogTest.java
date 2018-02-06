/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * Tests Dog, Labrador and Yorkshire objects.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class DogTest {

    /**
     * Creates several Dog objects and tests the functions.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        //Dog newDog = new Dog("Lucky");
        //Because Dog is a abstract class, it cannot be initialized.
        
        Labrador dog1 = new Labrador("Hannah", "golden");
        System.out.println("First dog:");
        System.out.println("toString method:");
        System.out.println(dog1.toString());
        System.out.println("Speak:");
        System.out.println(dog1.speak());
        System.out.println("Average Weight:");
        System.out.println(dog1.averageBreedWeightKG());
        
        Yorkshire dog2 = new Yorkshire("Sebastian", true);
        
        System.out.println("Second dog:");
        System.out.println("toString method:");
        System.out.println(dog2.toString());
        System.out.println("Speak:");
        System.out.println(dog2.speak());
        System.out.println("Average Weight:");
        System.out.println(dog2.averageBreedWeightKG());
    }

}
