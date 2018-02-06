/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * Sorts sales people.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class WeeklySales {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int num = 10;
        Salesperson[] spList = new Salesperson[num];
        final int[] totalSalesList = {10, 7, 6, 2, 0, 9, 8, 1, 7, 6};
        
        for (int i = 0; i < num; i++) {
            spList[i] = new Salesperson("sp" 
                    + (i + 1), "sp" + (i + 1), totalSalesList[i]);
        }
        
        System.out.println("Original list:");
        for (int i = 0; i < num; i++) {
            System.out.println("Sales Person" + (i + 1) + ":");
            System.out.println("First Name:" + spList[i].getFirstName());
            System.out.println("Last Name:" + spList[i].getLastName());
            System.out.println("Total Number of Sales:" 
                    + spList[i].getTotalSales() + "\n");
        }
        
        Sorting.insertionSort(spList);
        System.out.println("\n" + "After sorting:");
        for (int i = 0; i < num; i++) {
            System.out.println("Sales Person" + (i + 1) + ":");
            System.out.println("First Name:" + spList[i].getFirstName());
            System.out.println("Last Name:" + spList[i].getLastName());
            System.out.println("Total Number of Sales:" 
                    + spList[i].getTotalSales() + "\n");
        }
        

    }

}
