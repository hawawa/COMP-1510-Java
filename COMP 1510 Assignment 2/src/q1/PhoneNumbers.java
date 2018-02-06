package q1;
import java.util.Random;
import java.text.DecimalFormat;

/**
 * <p>
 * Creates the phone numbers.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class PhoneNumbers {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Random generator = new Random();
        DecimalFormat fmt = new DecimalFormat("000");
        final int lessFirst = 8;
        String first3digits = "" + generator.nextInt(lessFirst) 
        + generator.nextInt(lessFirst) + generator.nextInt(lessFirst);
        final int lessSecond = 636;
        String second3digits = "" + fmt.format(generator.nextInt(lessSecond));
        final int lessThird = 10;
        String third4digits = "" + generator.nextInt(lessThird) 
        + generator.nextInt(lessThird) + generator.nextInt(lessThird) 
        + generator.nextInt(lessThird);
        System.out.println(first3digits + "-" + second3digits 
                + "-" + third4digits);
        System.out.println("Question one was called and ran sucessfully.");
    }

};
