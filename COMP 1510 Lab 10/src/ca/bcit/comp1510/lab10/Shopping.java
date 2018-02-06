/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * <p>
 * Tests the Item class.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Shopping {

    /**
     * Asks user to input items and print them.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Transaction myTransaction = new Transaction(1);
            String name;
            double price;
            int quantity;
            boolean end = false;
            if (i == 0) {
                System.out.println("Using three parameters"
                        + " of addToCart method.");
            } else {
                System.out.println("Using one Item object"
                        + " of addToCart method.");
            }
            do {                
                System.out.println("Please enter the item "
                        + "you want to buy:\nName:");
                name = scan.next();
                System.out.println("Price:");
                price = scan.nextDouble();
                System.out.println("quantity:");
                quantity = scan.nextInt();
                if (i == 0) {
                    myTransaction.addToCart(name, price, quantity);
                } else {
                    myTransaction.addToCart(new Item(name, price, quantity));
                }
                               
                boolean validation = false;
                String answer = "";
                while (!validation) {
                    System.out.println("Do you want to buy other item?(Y/N)");
                    answer = scan.next();
                    
                    if (!answer.equals("Y") && !answer.equals("N")) {
                        System.out.println("Enter Y or N!");
                    } else {
                        validation = true;
                    }
                }
                if (answer.equals("N")) {
                    end = true;
                }

                
            } while (!end);
            
            System.out.println(myTransaction.toString() + "\n");
        }
        
        scan.close();

    }

}
