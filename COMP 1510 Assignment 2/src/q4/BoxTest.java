package q4;
import java.util.Scanner;

/**
 * <p>
 * Creates two Box objects to test Box class.
 * First one inputs the values by coding.
 * Second one inputs the values by user.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class BoxTest {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final double firstHeight = 5.0;
        final double firstWidth = 4.0;
        final double firstDepth = 2.0;
        Box box1 = new Box(firstHeight, firstWidth, firstDepth);
        System.out.println("The first box:\n" 
                + "Before setting: the height is " + box1.getHeight() 
                + ", the width is " + box1.getWidth() 
                + ", the depth is " + box1.getDepth() 
                + ", the full is " + box1.getFull());
        final double firstNewHwight = 3.2;
        final double firstNewWidth = 4.8;
        final double firstNewDepth = 1.5;
        box1.setHeight(firstNewHwight);
        box1.setWidth(firstNewWidth);
        box1.setDepth(firstNewDepth);
        box1.setFull(true);
        System.out.println("After setting: " + box1.toString());
        
        Scanner scan = new Scanner(System.in);
        final double secondHeight = 10.0;
        final double secondWidth = 7.0;
        final double secondDepth = 5.0;
        Box box2 = new Box(secondHeight, secondWidth, secondDepth);
        System.out.println("The second box:\n" 
                + "Before setting: the height is " + box2.getHeight() 
                + ", the width is " + box2.getWidth() 
                + ", the depth is " + box2.getDepth());
        System.out.println("Please enter a new height for the second box:");
        box2.setHeight(scan.nextDouble());
        System.out.println("Please enter a new width for the second box:");
        box2.setWidth(scan.nextDouble());
        System.out.println("Please enter a new depth for the second box:");
        box2.setDepth(scan.nextDouble());
        System.out.println("Please enter "
                + "if the second box is full (true or false):");
        box2.setFull(scan.nextBoolean());
        System.out.println("After setting: " + box2.toString());
        scan.close();
        
        System.out.println("Question four was called and ran sucessfully.");
    }

};
