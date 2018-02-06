/**
 * 
 */
package ca.bcit.comp1510.lab8;

/**
 * <p>
 * Cat object.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Cat {
    /** Hold the name. */
    private final String name;
    /** Hold the age. */
    private int age;
    
    /**
     * Constructs a Cat object by defining its name and age.
     * @param name
     *            a string for cat's name
     * @param age
     *            a integer for cat's age
     */
    public Cat(String name, int age) {
        if (name.trim().isEmpty()) {
            this.name = "Cleo";
        } else {
            this.name = name;
        }
        
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    /**
     * Constructs a Cat object by defining its age.
     * @param age
     *            a integer for cat's age
     */
    public Cat(int age) {
        this.name = "Cleo";
        
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    /**
     * Accessor for cat's name.
     * @return String as cat's name
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor for cat's age.
     * @return integer as cat's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Mutator for the cat's age.
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Returns a String representation of this Cat.
     * @return String representation of this Cat.
     */
    public String toString() {
        return "This cat's name is " + name + ", age is " + age + ".";
    }
    
    

}
