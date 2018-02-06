/**
 * 
 */
package ca.bcit.comp1510.lab4;

/**
 * Name is a class for first, middle, and last name.
 * 
 * @author Chih-Hsi Chang
 * @version 2017-10-04
 */
public class Name {
    //2.variables
    /**firstName variable.*/
    private String firstName;
    /**middleName variable.*/
    private String middleName;
    /**lastName variable.*/
    private String lastName;
    
    //3.constructor
    /**Set Name conductor.*/
    /**
     * Constructs an name object by defining its first, middle, and last name.
     * 
     * @param first
     *            first name
     * @param middle
     *            middle name
     * @param last
     *            last name
     */
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    
    //4.
    //accessors
    /**
     * Return first name.
     * 
     * @return the first name.
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Return middle name.
     * 
     * @return the middle name.
     */
    public String getMiddleName() {
        return middleName;
    } 
    /**
     * Return last name.
     * 
     * @return the last name.
     */
    public String getLastName() {
        return lastName;
    }  
    
    //mutators
    /**
     * Set first name.
     * 
     * @param name
     *            a string to name
     */
    public void setFirstName(String name) {
        firstName = name;
    }
    /**
     * Set middle name.
     * 
     * @param name
     *            a string to name
     */
    public void setMiddleName(String name) {
        middleName = name;
    }
    /**
     * Set last name.
     * 
     * @param name
     *            a string to name
     */
    public void setLastName(String name) {
        lastName = name;
    }
    
    //5. toString method
    /**
     * Return the full name.
     * 
     * @return the full name.
     */
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }
    
    
    
}
