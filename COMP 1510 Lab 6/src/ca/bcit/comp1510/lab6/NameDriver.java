/**
 * 
 */
package ca.bcit.comp1510.lab6;

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
        //creates some Name objects
        Name myName = new Name("Chih-Hsi", "", "Chang");
        Name myNameNoFirst = new Name("   ", "ha", "ChAng");
        Name myNameNoMiddle = new Name("chih-Hsi", "", "ChanG");
        Name myNameNoLast = new Name("ChiH-Hsi", "hA", " ");

        //tests the constructors
        System.out.println(myName);        
        System.out.println(myNameNoFirst);
        System.out.println(myNameNoMiddle);
        System.out.println(myNameNoLast);
        
        //tests the setters
        System.out.println("Original name: " + myName); 
        myName.setFirstName("");
        myName.setMiddleName("    ");
        myName.setLastName("Lin");
        System.out.println("New name: " + myName); 
                
        //tests the getNCharacter method in Name class
        final int nth1 = 5;
        System.out.println("nth: " + nth1);
        System.out.println("getNCharacter method return: " 
                + myName.getNCharacter(nth1));
        
        final int nth2 = 75;
        System.out.println("nth: " + nth2);
        System.out.println("getNCharacter method return: " 
                + myName.getNCharacter(nth2));

    }

}
