/**
 * 
 */
package ca.bcit.comp1510.lab9;

/**
 * <p>
 * Represents a name which includes first, middle and last name. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Name implements Comparable<Name> {
    /** Hold the first name. */
    private final String first;
    /** Hold the middle name. */
    private final String middle;
    /** Hold the last name. */
    private final String last;

    /**
     * Constructs a Name object by defining first, middle and last name.
     * @param first
     *            a string for first name
     * @param middle
     *            a string for middle name
     * @param last
     *            a string for last name
     */
    public Name(String first, String middle, String last) {
        if (first.trim().equals("") || last.trim().equals("")) {
            throw new IllegalArgumentException("First and last name can't be"
                    + " empty or only whith space.");
        }
        this.first = first;
        if (middle == null) {
            this.middle = "";
        } else {
            this.middle = middle;
        }
        this.last = last;
    }
   
    /**
     * Accessor for first name.
     * @return String as first name
     */
    public String getFirst() {
        return first;
    }
    
    /**
     * Accessor for middle name.
     * @return String as middle name
     */
    public String getMiddle() {
        return middle;
    }
    
    /**
     * Accessor for last name.
     * @return String as last name
     */
    public String getLast() {
        return last;
    }


    /**
     * Compares to another Name object by last, middle and first name.
     * @return integer represents the result of the comparison.
     */
    @Override
    public int compareTo(Name compareName) {
        if (!this.last.equals(compareName.last)) {
            return this.last.compareTo(compareName.last);
        } else if (!this.middle.equals(compareName.middle)) {
            return this.middle.compareTo(compareName.middle);
        } else if (!this.first.equals(compareName.first)) {
            return this.first.compareTo(compareName.first);
        } else {
            return 0;
        }
        
    }
    
    
    
    
}
