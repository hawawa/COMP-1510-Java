/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * <p>
 * A abstract class which represents a dog 
 * which includes name and some methods. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public abstract class Dog {
    /** Dog name. */
    private final String name;
    
    /**
     * Constructs a dog by defining name.
     * Its name should not be null or only white space.
     * @param name
     *            a string for dog's name
     */    
    public Dog(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("The Dog's name "
                    + "should not be null or whitespace!");
        } else {
            this.name = name;
        }
            
    }

    /**
     * Accessor for dog name.
     * @return String as dog name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Return its speak sound.
     * @return String as sound.
     */
    public String speak() {
        return "WOOF";
    }
    
    /**
     * Return average of breed weight in KG.
     * @return double as average of breed weight in KG.
     */
    public abstract double averageBreedWeightKG();

    
    /**
     * Returns a String representation of this dog.
     * @return String representation of this dog.
     */
    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }
    
    /**
     * Checks if two Dog objects are equal.
     * @param other another Object.
     * @return boolean 
     *          If they are equal, return true.
     *          If they are not equal, return false.
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (this == other) {
            return true;
        } else if (!getClass().equals(other.getClass())) {
            return false;
        } else {
            return this.getName().equals(((Dog) other).getName());
        }

    }
    
    

}
