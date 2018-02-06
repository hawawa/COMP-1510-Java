package q3;

import java.text.DecimalFormat;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Chih-Hsi Chang
 * @version 2.0
 */
public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /** The first test score of this student. */
    private int testScore1;
    
    /** The second test score of this student. */
    private int testScore2;
    
    /** The third test score of this student. */
    private int testScore3;
    

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     */
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }
    
    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     * @param score1 a integer representing the first score.
     * @param score2 a integer representing the second score.
     * @param score3 a integer representing the third score.
     */
    public Student(String first, String last, Address home, Address school,
            int score1, int score2, int score3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = score1;
        testScore2 = score2;
        testScore3 = score3;
    }
    
    /**
     * Constructs a Student object that contains only 0 for the test scores.
     */
    public Student() {
        testScore1 = 0;
        testScore2 = 0;
        testScore3 = 0;
    }

    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test Score 1:\n" + testScore1 + "\n";
        result += "Test Score 2:\n" + testScore2 + "\n";
        result += "Test Score 3:\n" + testScore3 + "\n";
        result += "Average:\n" + average() + "\n";
        
        return result;
    }
    
    /**
     * Sets the test scores. 
     * 
     * @param testNumber
     *            which test
     * @param score
     *            the score for that test
     */
    public void setTestScore(int testNumber, int score) {
        final int numberOfTest = 3;
        if (testNumber < 1 || testNumber > numberOfTest) {
            throw new IllegalArgumentException("The test number should be "
                    + "between 1 and 3.");
        }
        
        char magicChar = (char) ('A' + testNumber - 1);
        
        switch (magicChar) {
        case 'A':
            testScore1 = score;
            break;
        case 'B':
            testScore2 = score;
            break;
        case 'C':
            testScore3 = score;
            break;
        default:
        }

    }
    
    /**
     * Gets the test scores. 
     * 
     * @param testNumber
     *            which test
     * @return integer
     *            as the score for that test
     */
    public int getTestScore(int testNumber) {
        final int numberOfTest = 3;
        if (testNumber < 1 || testNumber > numberOfTest) {
            throw new IllegalArgumentException("The test number should be "
                    + "between 1 and 3.");
        }
        
        char magicChar = (char) ('A' + testNumber - 1);
        if (magicChar == 'A') {
            return testScore1;
        } else if (magicChar == 'B') {
            return testScore2;
        } else {
            return testScore3;
        }

    }
    
    /**
     * Calculates the average of three test scores. 
     * 
     * @return double
     *            as the average
     */
    public double average() {
        DecimalFormat df = new DecimalFormat("#.##");
        final int first = 1;
        final int second = 2;
        final int third = 3;
        final double numberOfTest = 3.0;
        
        return Double.parseDouble(df.format((getTestScore(first) 
                + getTestScore(second) + getTestScore(third)) / numberOfTest));
    }
        
}

