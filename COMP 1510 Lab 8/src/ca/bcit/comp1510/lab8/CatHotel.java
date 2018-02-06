/**
 * 
 */
package ca.bcit.comp1510.lab8;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>
 * Cat hotel object.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class CatHotel {
    /** Hold the Cat object list. */
    private ArrayList<Cat> guests;
    /** Hold the name. */
    private String hotelName;
    
    /**
     * Constructs a CatHotel object by defining its name.
     * @param hotelName
     *            a string for hotel's name
     */
    public CatHotel(String hotelName) {
        this.hotelName = hotelName;
        this.guests = new ArrayList<Cat>();
    }
    
    /**
     * <p>
     * Adds a Cat into the CatHotel list.
     * <p>
     * @param newCat as a Cat object
     */    
    public void addCat(Cat newCat) {
        guests.add(newCat);
    }
    
    /**
     * <p>
     * Removes all Cats on the CatHotel list.
     * <p>
     */    
    public void removeAllGuests() {
        guests.clear();
    }
    
    /**
     * <p>
     * Counts how many Cats on the CatHotel's list.
     * <p>
     * @return the number of the cats on the list as an integer
     */    
    public int guestCount() {
        return guests.size();
    }
    
    /**
     * <p>
     * Removes the cats which are older than the limitation age.
     * <p>
     * @param ageLimit the limitation of cat's age
     * @return how many cats are evicted as an integer
     */    
    public int removeOldGuests(int ageLimit) {
        int count = 0;
        Iterator<Cat> catIterator = guests.iterator();
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() > ageLimit) {
                count++;
                catIterator.remove();
            }
        }

        return count;
    }
    
    /**
     * <p>
     * prints the cat list.
     * <p>
     */    
    public void printGuestList() {
        System.out.println(this.hotelName);
        for (Cat temp:guests) {
            System.out.println(temp.toString());
        }
    }
    

}
