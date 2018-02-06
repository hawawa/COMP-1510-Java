package q4;

import q3.Address;
import q3.Student;

/**
 * <p>
 * Tests the Course object.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class TestCourse {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Course myCourse = new Course("Java");
        System.out.println("Before adding students:");
        myCourse.roll();
        System.out.println("The average is:\n" + myCourse.average());
        Address studentHA = new Address("Wales St.",
                "Vancouver", "BC", "V5R 3N4");
        Address studentDA = new Address("3700 Willingdon Ave.",
                "Burnaby", "BC", "V5G 3H2");
        final int st1score1 = 95;
        final int st1score2 = 100;
        final int st1score3 = 99;
        myCourse.addStudent(new Student("Chih-Hsi1", "Chang",
                studentHA, studentDA, st1score1, st1score2, st1score3));
        final int st2score1 = 100;
        final int st2score2 = 92;
        final int st2score3 = 97;
        myCourse.addStudent(new Student("Chih-Hsi2", "Chang",
                studentHA, studentDA, st2score1, st2score2, st2score3));
        final int st3score1 = 98;
        final int st3score2 = 99;
        final int st3score3 = 96;
        myCourse.addStudent(new Student("Chih-Hsi3", "Chang",
                studentHA, studentDA, st3score1, st3score2, st3score3));
        final int st4score1 = 92;
        final int st4score2 = 98;
        final int st4score3 = 100;
        myCourse.addStudent(new Student("Chih-Hsi4", "Chang",
                studentHA, studentDA, st4score1, st4score2, st4score3));
        final int st5score1 = 93;
        final int st5score2 = 95;
        final int st5score3 = 100;
        myCourse.addStudent(new Student("Chih-Hsi5", "Chang",
                studentHA, studentDA, st5score1, st5score2, st5score3));
        System.out.println("After adding students:");
        myCourse.roll();
        System.out.println("The course average is:\n" + myCourse.average());
        
        System.out.println("Question four was called and ran sucessfully.");
    }

};
