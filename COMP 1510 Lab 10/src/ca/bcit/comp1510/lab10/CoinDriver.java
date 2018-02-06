/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * <p>
 * Tests the Coin class which implements the Lockable interface.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class CoinDriver {

    /**
     * Creates a Coin object and tries to lock and unlock.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Create a Coin object and flip it.");
        Coin myCoin = new Coin();
        System.out.println("Set the key.");
        final int key = 5678;
        myCoin.setKey(key);
        System.out.println("Flip again.");
        myCoin.flip();
        System.out.println("Unlock and flip 5 times.");
        myCoin.unlock(key);
        final int flipTime = 5;
        for (int i = 0; i < flipTime; i++) {
            myCoin.flip();
            System.out.println(myCoin.toString());
        }
        System.out.println("Lock and flip again.");
        myCoin.lock(key);
        myCoin.flip();


    }

}
