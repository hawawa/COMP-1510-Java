/**
 * 
 */
package q4;

import java.text.DecimalFormat;
import java.util.ArrayList;

import q3.Student;

/**
 * Represents a course.
 * 
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Course {
    /** The name of this course. */
    private String courseName;
    /** Holding a Student ArrayList. */
    private ArrayList<Student> stList = new ArrayList<Student>();
    
    /**
     * Constructs a Course object that contains only course name.
     * @param name a String for course name
     */
    public Course(String name) {
        this.courseName = name;
    }
    
    /**
     * Adds a Student object to this course. 
     * 
     * @param st
     *            the student which is added
     */
    public void addStudent(Student st) {
        final int studentLimit = 5;
        if (stList.size() == studentLimit) {
            throw new IllegalArgumentException("There are already "
                    + "5 studnets in this course!!");
        } else {
            stList.add(st);
        }

    }
    
    /**
     * Calculates the average score for all students in this course. 
     * 
     * @return double
     *            as the average score
     */
    public double average() {
        double sum = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        for (Student temp: stList) {
            sum += temp.average();
        }
        if (stList.size() == 0) {
            return 0.0;
        } else {
            return Double.parseDouble((df.format(sum / stList.size())));
        }

        
    }
    
    /**
     * Prints all the students in this course. 
     * 
     */
    public void roll() {
        if (stList.size() == 0) {
            System.out.println("There is no student in this course!!");
        } else {
            System.out.println(courseName + " course:");
            for (Student temp: stList) {
                System.out.println("Student " 
                        + (stList.indexOf(temp) + 1) + ":");
                System.out.println(temp.toString());
            }
        }
        

    }
    
}
