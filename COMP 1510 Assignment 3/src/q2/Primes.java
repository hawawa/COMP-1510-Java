package q2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p>
 * Returns the prime numbers.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Primes {
    /** Hold the primes ArrayList. */
    private static ArrayList<Boolean> primes = new ArrayList<Boolean>();
    
    /**
     * Constructs a Primes object by defining a upper bound.
     * @param n
     *            a string for word
     */
    public Primes(int n) {
        for (int i = 0; i <= n; i++) {
            primes.add(true);
        }
        calculatePrimes(n);

    }
    
    /**
     * Calculate which number is a prime between 0 to n. 
     * 
     * @param n
     *            the upper bound
     */
    private static void calculatePrimes(int n) {
        primes.set(0, false);
        primes.set(1, false);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes.get(i)) {
                for (int j = i + i; j <= n; j += i) {
                    primes.set(j, false);
                }
            }
        }

    }
    
    /**
     * Prints all the primes.
     * 
     */
    private void printPrimes() {
        System.out.println("The prime numbers between 0 and " 
                + (primes.size() - 1) + " are:");
        for (int i = 0; i < primes.size(); i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            
        }
        System.out.println("");
       
    }
    
    /**
     * Calculate how many primes. 
     * 
     * @return integer as how many primes
     */
    private int countPrimes() {
        int counter = 0;
        for (Boolean temp : primes) {
            if (temp) {
                counter++;
            }
        }
        return counter;
    }
    
    /**
     * Checks if a number is a prime.
     * 
     * @param x
     *            the number
     * @throws ArrayIndexOutOfBoundsException
     *            avoiding the number is outside the range
     * @return boolean if the number is a prime
     */
    private boolean isPrime(int x) throws ArrayIndexOutOfBoundsException {
        if (x < 0 || x > primes.size()) {
            throw new ArrayIndexOutOfBoundsException("The input for isPrime "
                    + "method should be between 0 and " 
                    + (primes.size() - 1)  + ".");
        }
            
        return primes.get(x);
        
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan;
        boolean end = false;
        System.out.println("This program uses the sieve of Eratosthenes "
                + "to determine which numbers are prime.");

        while (!end) {
            scan = new Scanner(System.in);
            System.out.println("Please enter an upper bound:");
            
            try {
                int n = scan.nextInt();
                if (n > 1) {
                    Primes myPrimes = new Primes(n);
                    System.out.println("There are " + myPrimes.countPrimes() 
                    + " primes.");
                    myPrimes.printPrimes();
                    scan.close();
                    end = true; 
                } else {
                    System.out.println("Wrong input!!\nThe input should be "
                            + "a integer number which is greater than one.");
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Wrong input!!\nThe input should be "
                        + "a integer number which is greater than one.");
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!!\nThe input should be "
                        + "a integer number which is greater than one.");
            }
            
        }
        
        System.out.println("Question two was called and ran sucessfully.");

    }
    


}
