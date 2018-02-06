package q1;

import java.util.Scanner;

/**
 * <p>Prints the equivalent amount change.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Change {
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //prompt and scan
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount:");
        double amount = scan.nextDouble();
        
        //Change to cents
        final int convertocents = 100;
        int amount100 = (int) (amount * convertocents);
        
        //ten dollar bills
        final int tendollar = 1000;
        System.out.println((amount100 / tendollar) + " ten dollar bills");
        amount100 = amount100 % tendollar;
        
        //five dollar bills
        final int fivedollar = 500;
        System.out.println((amount100 / fivedollar) + " five dollar bills");
        amount100 = amount100 % fivedollar;
        
        //two dollar coins
        final int twodollar = 200;
        System.out.println((amount100 / twodollar) + " two dollar coins");
        amount100 = amount100 % twodollar;
        
        //one dollar coins
        final int onedollar = 100;
        System.out.println((amount100 / onedollar) + " one dollar coins");
        amount100 = amount100 % onedollar;
        
        //quarters
        final int quartercoin = 25;
        System.out.println((amount100 / quartercoin) + " quarters");
        amount100 = amount100 % quartercoin;
                
        //dimes
        final int dimecoin = 10;
        System.out.println((amount100 / dimecoin) + " dimes");
        amount100 = amount100 % dimecoin;
        
        //nickles
        final int nicklecoin = 5;
        System.out.println((amount100 / nicklecoin) + " nickles");
        amount100 = amount100 % nicklecoin;
        
        //pennies
        final int penniecoin = 1;
        System.out.println((amount100 / penniecoin) + " pennies");
        amount100 = amount100 % penniecoin;
        
        //close scan object
        scan.close();
    }

};
