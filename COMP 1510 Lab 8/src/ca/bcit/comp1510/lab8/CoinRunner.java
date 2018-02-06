/**
 * 
 */
package ca.bcit.comp1510.lab8;


/**
 * <p>
 * Calculates how many times the longest run is in 100 flips of coin. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class CoinRunner {

    /**
     * Creates a Coin object, flips it, prints the result,
     * and calculates how many times the longest run is.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Coin myCoin = new Coin();
        int longestRun = 0;
        int run = 0;
        final int repeatTimes = 100;
        for (int i = 1; i <= repeatTimes; i++) {
            myCoin.flip();
            System.out.println(myCoin.toString());
            if (myCoin.isHeads()) {
                run++;
            } 
            if (!myCoin.isHeads() || i == repeatTimes) {
                if (run > longestRun) {
                    longestRun = run;
                }
                run = 0;
            }
        }
        
        System.out.println("The longest run of heads is " + longestRun + ".");
   
    }

}
