/**
 * 
 */
package ca.bcit.comp1510.lab12;


/**
 * <p>
 * Represents a sale person which includes first name, 
 * last name and total sales.
 * Implements Comparable. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Salesperson implements Comparable<Salesperson> {
    /** First name. */
    private final String firstName;
    /** Last name. */
    private final String lastName;
    /** Total sales. */
    private final int totalSales;
    
    /**
     * Constructs a sales person by defining first name, 
     * last name and total sales.
     * Its side length should be greater than 0.
     * @param firstName
     *            a String for first name
     * @param lastName
     *            a String for last name
     * @param totalSales
     *            a integer for total sales
     */  
    public Salesperson(String firstName, String lastName, int totalSales) {
        if (firstName == null || firstName.isEmpty() 
                || lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException(
                    "Either of the names are null or empty String!");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
            this.totalSales = totalSales;
        }

    }

    /**
     * Accessor for first name.
     * @return String as first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Accessor for last name.
     * @return String as last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Accessor for total sales.
     * @return String as total sales
     */
    public int getTotalSales() {
        return totalSales;
    }
    
    /**
     * Compares one sales person with another sales person by their total sales.
     * @param other
     *            another SalesPerson object
     * @return integer 
     *              If their total sales are equal, return 0.
     *              If this total sales is less than 
     *              the argument's total sales, return -1.
     *              If this total sales is greater than 
     *              the argument's total sales, return 1.
     */
    public int compareTo(Salesperson other) {
        Integer thisInteger = new Integer(this.getTotalSales());
        Integer otherInteger = new Integer(other.getTotalSales());
        return thisInteger.compareTo(otherInteger);
    }
    

}
