/**
 * 
 */
package ca.bcit.comp1510.lab6;

/**
 * <p>Represents first, middle, and last name.</p>
 *
 * @author Chih-Hsi Chang
 * @version 3.0
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
    /**
     * Constructs an name object by defining its first, middle, and last name.
     * 
     * @param first
     *            a string for first name
     * @param middle
     *            a string for middle name
     * @param last
     *            a string for last name
     */
    public Name(String first, String middle, String last) {
        if (first.trim().length() != 0) {
            firstName = first.substring(0, 1).toUpperCase() 
                    + first.substring(1).toLowerCase();            
        } else {
            firstName = "FIRST";
        }
        
        if (middle.trim().length() != 0) {
            middleName = middle.substring(0, 1).toUpperCase() 
                    + middle.substring(1).toLowerCase();            
        } else {
            middleName = "MIDDLE";
        }
        if (last.trim().length() != 0) {
            lastName = last.substring(0, 1).toUpperCase() 
                    + last.substring(1).toLowerCase();            
        } else {
            lastName = "LAST";
        }
    }
    
    //4.
    //accessors
    /**
     * Return first name.
     * 
     * @return firstname as a String
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Return middle name.
     * 
     * @return middlename as a String
     */
    public String getMiddleName() {
        return middleName;
    } 
    /**
     * Return last name.
     * 
     * @return lastname as a String
     */
    public String getLastName() {
        return lastName;
    }  
    
    //mutators
    /**
     * Sets the first name 
     * with capitalized first character and rest are lower case.
     * 
     * @param name as a String
     */
    public void setFirstName(String name) {
        if (name.trim().length() != 0) {
            firstName = name.substring(0, 1).toUpperCase() 
                    + name.substring(1).toLowerCase();
        }
    }
    /**
     * Sets the middle name 
     * with capitalized first character and rest are lower case.
     * 
     * @param name as a string
     */
    public void setMiddleName(String name) {
        if (name.trim().length() != 0) {
            middleName = name.substring(0, 1).toUpperCase() 
                    + name.substring(1).toLowerCase();
        }
    }
    /**
     * Sets the last name 
     * with capitalized first character and rest are lower case.
     * 
     * @param name as a string
     */
    public void setLastName(String name) {
        if (name.trim().length() != 0) {
            lastName = name.substring(0, 1).toUpperCase() 
                    + name.substring(1).toLowerCase();
        }
    }
    
    //5. toString method
    /**
     * Returns a String of this full name as "first name middle name last name".
     * 
     * @return toString description 
     * containing the first name, middle name, and last name
     */
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }
    
    //lab 5
    //3.a
    /**
     * Returns the total length of this full name.
     * 
     * @return sumLengths as a int
     */
    public int sumLengths() {
        return firstName.length() + middleName.length() + lastName.length();
    }
    
    //3.b
    /**
     * Returns the upper case of this full name.
     * 
     * @return nameUppercase as a String
     */
    public String nameUppercase() {
        return toString().toUpperCase();
    }
    
    //3.c
    /**
     * Returns the nth character of this full name.
     * 
     * @param n as a int
     * @return getNCharacter as a char
     */
    public char getNCharacter(int n) {
        if (n > toString().length()) {
            return '@';
        } else {
            return toString().charAt(n - 1);
        }
    }
    
    //3.d
    /**
     * Returns the full name as "last name, first name middle name".
     * 
     * @return fullName as a String
     */
    public String fullName() {
        return lastName + ", " + firstName + " " + middleName;
    }
    
    //3.e
    /**
     * Returns if the string parameter you enter equals to the first name.
     * 
     * @param str as a String
     * @return isEqual as a boolean
     */
    public boolean isEqual(String str) {
        return firstName.equals(str);
    }
    
    //3.f
    /**
     * Returns if the Name object you enter equals to the Name object.
     * 
     * @param name as a Name object
     * @return isEqualtoNameObj as a boolean
     */
    public boolean isEqualtoNameObj(Name name) {
        return this.firstName.equals(name.getFirstName())
                && this.middleName.equals(name.getMiddleName()) 
                && this.lastName.equals(name.getLastName());
    }
    
}
