package q3;

/**
 * <p>
 * Tests the Student object.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class TestStudent {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Address student1HA = new Address("Wales St.",
                "Vancouver", "BC", "V5R 3N4");
        Address student1DA = new Address("3700 Willingdon Ave.",
                "Burnaby", "BC", "V5G 3H2");
        final int firstScoreForSt1 = 95;
        final int secondScoreForSt1 = 100;
        final int thirdScoreForSt1 = 99;
        Student student1 = new Student("Chih-Hsi", "Chang", student1HA,
                student1DA, firstScoreForSt1,
                secondScoreForSt1, thirdScoreForSt1);
        System.out.println("First student:\n" + student1.toString());
        
        Student student2 = new Student();
        System.out.println("Before setting:");
        System.out.println("Second student:\n" + student2.toString());
        final int first = 1;
        final int second = 2;
        final int third = 3;
        final int firstScoreForSt2 = 95;
        final int secondScoreForSt2 = 100;
        final int thirdScoreForSt2 = 99;
        student2.setTestScore(first, firstScoreForSt2);
        student2.setTestScore(second, secondScoreForSt2);
        student2.setTestScore(third, thirdScoreForSt2);
        System.out.println("After setting:");
        System.out.println("Second student:\n" + student2.toString());
        
        System.out.println("Question three was called and ran sucessfully.");
    }

};
