/**
 * 
 */
package ca.bcit.comp1510.lab9;
import java.util.ArrayList;


/**
 * <p>
 * Sorts the Name objects.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Driver {

    /**
     * Creates five Name object in a ArrayList.
     * Sorts these Names by using sort method.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Name name1 = new Name("Chih-Hsi1", null, "Chang");
        Name name2 = new Name("Chih-Hsi3", "", "Chang5");
        Name name3 = new Name("Chih-Hsi3", "", "Chang4");
        Name name4 = new Name("Chih-Hsi3", "", "Chang6");
        Name name5 = new Name("Chih-Hsi2", "", "Chang");
        ArrayList<Name> nameList = new ArrayList<Name>();
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        nameList.add(name5);
        
        System.out.println("Before sorting:");
        for (Name myName: nameList) {
            System.out.println(myName.getFirst() + " " + myName.getMiddle() 
            + " " + myName.getLast());
        }
        
        nameList.sort(null);
        
        System.out.println("After sorting:");
        for (Name myName: nameList) {
            System.out.println(myName.getFirst() + " " + myName.getMiddle() 
            + " " + myName.getLast());
        }
        
        

    }

}
