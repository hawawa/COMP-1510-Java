package ca.bcit.comp1510.lab12;


import java.util.Scanner;

/**
 * Numbers.
 *
 * @author BCIT
 * @author Chih-Hsi Chang
 * @version 2.0
 */
public class Numbers {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Integer[] intList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }
        Integer[] intList1 = intList;
        Integer[] intList2 = intList;
        Integer[] intList3 = intList;
        Integer[] intList4 = intList;
        
        //Insertion Sort
        Sorting.insertionSortA(intList1);
        System.out.println("\nYour numbers "
                + "in sorted order by ascending Insertion Sort...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList1[i] + "  ");
        }
        
        Sorting.insertionSort(intList2);
        System.out.println("\nYour numbers "
                + "in sorted order by descending Insertion Sort...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList2[i] + "  ");
        }
        System.out.println();
        
        
        //Selection Sort
        Sorting.selectionSort(intList3);
        System.out.println("\nYour numbers "
                + "in sorted order by ascending Selection Sort...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList3[i] + "  ");
        }
        
        Sorting.selectionSortD(intList4);
        System.out.println("\nYour numbers "
                + "in sorted order by descending Selection Sort...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList4[i] + "  ");
        }
        System.out.println();
        
        
        scan.close();
    }
}


