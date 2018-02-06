/**
 * 
 */
package ca.bcit.comp1510.lab5;

/**
 * <p>Tests if the Name class works.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class NameDriver {

    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //Creates a Name object
        Name myName = new Name("Chih-Hsi", "", "Chang");
        
        //tests the methods in Name class
        //sumLengths()
        System.out.println(myName.sumLengths());
        //nameUppercase()
        System.out.println(myName.nameUppercase());
        //getNCharacter()
        final int nth = 5;
        System.out.println(myName.getNCharacter(nth));
        //fullName()
        System.out.println(myName.fullName());
        //isEqual()
        System.out.println(myName.isEqual("Chih-Hsi"));
        //isEqualtoNameObj()
        System.out.println(myName.isEqualtoNameObj(myName));
    }

}
