package q3;

import java.util.Scanner;

/**
 * <p>
 * Represents MIXChar and its functions.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public final class MIXChar {
    /** Holding the Unicode of DELTA. */
    private static final char DELTA = '\u0394';
    /** Holding the Unicode of SIGMA. */
    private static final char SIGMA = '\u03A3';
    /** Holding the Unicode of PI. */
    private static final char PI = '\u03A0';
    
    /** Holding the number of MIX characters. */
    private static final int NUMBERMIXCHAR = 56;
    /** Holding the char list for MIX characters. */
    private static final char[] CHARLIST = new char[NUMBERMIXCHAR];
    
    /** Holding the value of MIX character. */
    private int value;
    
    /**
     * Sets its value for a MIXChar object.
     * @param value the value of MIX character.
     */
    private MIXChar(int value) {
        this.value = value;
    }
        
    /**
     * Creates the MIX charter list.
     */
    static void createMIXCharList() {
        
        char[] special = {' ', '.', ',', '(', ')', '+', '-', '*', '/',
                '=', '$', '<', '>', '@', ';', ':', '\''}; 

        int j = 0;
        final int capitalStart = 65;
        int capital = capitalStart;
        final int numberStart = 48;
        int number = numberStart;
        final int capitalIndex1 = 9;
        final int deltaIndex = 10;
        final int capitalIndex2 = 19; 
        final int sigmaIndex = 20;
        final int piIndex = 21;
        final int capitalIndex3 = 29;
        final int numberIndex = 39;
        
        for (int i = 0; i < NUMBERMIXCHAR; i++) {
            if (i == 0) {
                CHARLIST[i] = special[j];
                j++;
            } else if (i <= capitalIndex1) {
                CHARLIST[i] = (char) capital;
                capital++;
            } else if (i == deltaIndex) {
                CHARLIST[i] = DELTA;
            } else if (i <= capitalIndex2) {
                CHARLIST[i] = (char) capital;
                capital++;
            } else if (i == sigmaIndex) {
                CHARLIST[i] = SIGMA;
            } else if (i == piIndex) {
                CHARLIST[i] = PI;
            } else if (i <= capitalIndex3) {
                CHARLIST[i] = (char) capital;
                capital++;
            } else if (i <= numberIndex) {
                CHARLIST[i] = (char) number;
                number++;
            } else {
                CHARLIST[i] = special[j];
                j++;
            }
            
        }
    }
    
    /**
     * Return the value of MIX character.
     * @return int 
     *          The value
     */
    public int ordinal() {
        return value;
    }
    
    /**
     * Checks if the character is MIX character.
     * @param c a character.
     * @return Matrix 
     *          The result of adding
     */
    static boolean isMIXChar(char c) {
        boolean result = false;
        for (char temp :CHARLIST) {
            if (c == temp) {
                result = true;
                break;
            }
        }
        return result;
    }
    
    /**
     * Convert character to MIXChar object.
     * @param c a character.
     * @return MIXChar 
     *          The MIXChar object
     */
    static MIXChar toMIXChar(char c) {
        if (isMIXChar(c)) {
            int value = 0;
            for (int i = 0; i < CHARLIST.length; i++) {
                if (c == CHARLIST[i]) {
                    value = i;
                    break;
                }
            }
            return new MIXChar(value);
        } else {
            throw new IllegalArgumentException("The char is not a MIXChar!");
        }
        
    }
    
    /**
     * Returns the character of a MIXChar object.
     * @param x a MIXChar object.
     * @return char 
     *          The character
     */
    static char toChar(MIXChar x) {
        return CHARLIST[x.ordinal()];
    }
    
    /**
     * Returns a String of a MIXChar array.
     * @param array a MIXChar array.
     * @return String 
     *          The String of the MIXChar array
     */
    static String toString(MIXChar[] array) {
        String result = "";
        for (MIXChar temp : array) {
            result = result + toChar(temp);
        }
        return result;
        
    }
    
    /**
     * Returns a MIXChar array of a String.
     * @param s a String.
     * @return MIXChar[] 
     *          The MIXChar array
     */
    static MIXChar[] toMIXChar(String s) {
        MIXChar[] array = new MIXChar[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = toMIXChar(s.charAt(i));
        }
        return array;
    }
    
    /**
     * Encodes a MIXChar array.
     * @param m a MIXChar array.
     * @return long[] 
     *          The long array
     */
    static long[] encode(MIXChar[] m) {
        final int numberOf1Digit = 11;
        long[] result = 
                new long[(int) Math.ceil((double) m.length / numberOf1Digit)];
        
        int j = 0;
        int digit = 0;
        for (int i = 0; i < m.length; i++) {
            result[j] = result[j] + (long) m[i].ordinal() 
                    * (long) Math.pow(NUMBERMIXCHAR, digit);
            digit++;
            if (i % numberOf1Digit == numberOf1Digit - 1) {
                j++;
                digit = 0;
            }
        }
        return result;
                
    }
        
    /**
     * Decodes a long array.
     * @param l a long array.
     * @return MIXChar[] 
     *          The MIXChar array
     */
    static MIXChar[] decode(long[] l) {
        final int numberOf1Digit = 11;
        MIXChar[] result = new MIXChar[l.length * numberOf1Digit];
        int j = 0;
        long number;
        for (int i = 0; i < l.length; i++) {
            number = l[i];
            for (int k = 0; k < numberOf1Digit; k++) {
                result[j] = new MIXChar((int) (
                        Long.remainderUnsigned(number, NUMBERMIXCHAR))); 
                number = Long.divideUnsigned(number, NUMBERMIXCHAR);
                j++;
            }
            
        }
        return result;
    }

    /**
     * Returns a String representing this MIXChar object.
     * @return String 
     *          The String
     */
    public String toString() {
        return "" + toChar(this);
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        createMIXCharList();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String text = scan.nextLine();
        boolean validation = true;
        for (int i = 0; i < text.length(); i++) {
            if (!isMIXChar(text.charAt(i))) {
                validation = false;
                break;
            }
          
        }
        
        if (validation) {
            System.out.println("Original String:");
            System.out.println(text);
            System.out.println("Encoding:");
            long[] encoding = encode(toMIXChar(text));
            for (int i = 0; i < encoding.length; i++) {
                System.out.print(encoding[i]);
                if (i != encoding.length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println("");
                }
            }
            System.out.println("Decoding:");
            MIXChar[] decoding = decode(encoding);
            System.out.println(toString(decoding));
        } else {
            System.out.println("Charaters are not all MIXChar!");
        }
        
        scan.close();
        
        System.out.println("Question three was called and ran sucessfully.");
        
        
    }
    
}

