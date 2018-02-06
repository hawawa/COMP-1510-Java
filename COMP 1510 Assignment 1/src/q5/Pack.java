package q5;

/**
 * <p>Encodes and decode the MIX computer number.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Pack {
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //declare the enter characters
        final char c1 = 'I';
        final char c2 = 'F';
        final char c3 = 'E';
        final char c4 = 'B';
        final char c5 = 'A';
        System.out.println("Original: " + c1 + c2 + c3 + c4 + c5);
        
        //set some constant for calculating
        final int bias = 1;
        final int base56 = 56;
        
        //convert characters to MIX computer numbers
        int num1 = c1 - 'A' + bias;
        int num2 = c2 - 'A' + bias;
        int num3 = c3 - 'A' + bias;
        int num4 = c4 - 'A' + bias;
        int num5 = c5 - 'A' + bias;

        //calculate encoded number
        int encoded = num1 * base56 * base56 * base56 * base56
                + num2 * base56 * base56 * base56 
                + num3 * base56 * base56
                + num4 * base56
                + num5;
        System.out.println("Encoded: " + encoded);
        
        //calculate decoded numbers
        int deNum1 = encoded / (base56 * base56 * base56 * base56);
        encoded = encoded % (base56 * base56 * base56 * base56);
        int deNum2 = encoded / (base56 * base56 * base56);
        encoded = encoded % (base56 * base56 * base56);
        int deNum3 = encoded / (base56 * base56);
        encoded = encoded % (base56 * base56);
        int deNum4 = encoded / (base56);
        encoded = encoded % (base56);
        int deNum5 = encoded;

        //convert decoded number to charcters
        char dec1 = (char) (deNum1 + 'A' - bias);
        char dec2 = (char) (deNum2 + 'A' - bias);
        char dec3 = (char) (deNum3 + 'A' - bias);
        char dec4 = (char) (deNum4 + 'A' - bias);
        char dec5 = (char) (deNum5 + 'A' - bias);
        System.out.println("Decoded: " + dec1 + dec2 + dec3 + dec4 + dec5);
    }

};
