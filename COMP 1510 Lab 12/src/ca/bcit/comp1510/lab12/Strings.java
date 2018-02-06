/**
 * 
 */
package ca.bcit.comp1510.lab12;

import java.util.Scanner;

/**
 * <p>
 * Strings.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Strings {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many Strings do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];
        System.out.println("\nEnter the Strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.next();
        }
        String[] stringList1 = stringList;
        String[] stringList2 = stringList;
        String[] stringList3 = stringList;
        String[] stringList4 = stringList;
        
        //Insertion Sort
        Sorting.insertionSortA(stringList1);
        System.out.println("\nYour Strings "
                + "in sorted order by ascending Insertion Sort...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList1[i] + "  ");
        }
        
        Sorting.insertionSort(stringList2);
        System.out.println("\nYour Strings "
                + "in sorted order by descending Insertion Sort...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList2[i] + "  ");
        }
        System.out.println();
        
        
        //Selection Sort
        Sorting.selectionSort(stringList3);
        System.out.println("\nYour Strings "
                + "in sorted order by ascending Selection Sort...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList3[i] + "  ");
        }
        
        Sorting.selectionSortD(stringList4);
        System.out.println("\nYour Strings "
                + "in sorted order by descending Selection Sort...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList4[i] + "  ");
        }
        System.out.println();
        
        scan.close();

    }

}
