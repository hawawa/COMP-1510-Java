/**
 * 
 */
package ca.bcit.comp1510.lab2;
//4.
import java.util.Scanner;

/**
 * Circle is for lab 2
 * @author Chih-Hsi Chang
 * @version 2017-09-19
 */
public class Circle {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        //2. Double or float should be used. Using final modifier to declare a constant.
        final double PI = 3.14159;
        //3.
        double radius;
        //5.
        Scanner myScanner = new Scanner(System.in);
        //6. prompt
        System.out.println("Please enter a radius value for the circle.");
        //7.
        radius = myScanner.nextDouble();
        //8. circumference
        double circumference;
        circumference = 2 * PI * radius;
        System.out.println("Circumference of the circle which radius is " + radius + " is " + circumference);
        //9. area
        double area;
        area = PI * radius * radius;
        System.out.println("Area of the circle which radius is " + radius + " is " + area);
        //10.
        double doubleRadius;
        doubleRadius = 2 * radius;
        double newArea, newCircumference;
        newArea = PI * doubleRadius * doubleRadius;
        newCircumference = 2 * PI * doubleRadius;
        System.out.println("Area will become " + newArea / area +" times, when radious is double.");
        System.out.println("Circumference will become " + newCircumference / circumference +" times, when radious is double.");
        
        myScanner.close();

    }

}
