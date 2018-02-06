package ca.bcit.comp1510.lab12;


/**
 * Sorting.
 *
 * @author BCIT
 * @author Chih-Hsi Chang
 * @version 2.0
 */
public class Sorting {
    /**
     * Sorts the specified array of objects using the selection sort algorithm.
     * Ascending order.
     * 
     * @param <T>
     *            Type placeholder for comparable type
     * @param list
     *            Array to be sorted
     */
    public static <T extends Comparable<T>> void selectionSort(T[] list) {
        int min;
        T temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo((T) list[min]) < 0) {
                    min = scan;
                }
            }

            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
    
    /**
     * Sorts the specified array of objects using the selection sort algorithm.
     * Descending order.
     * 
     * @param <T>
     *            Type placeholder for comparable type
     * @param list
     *            Array to be sorted
     */
    public static <T extends Comparable<T>> void selectionSortD(T[] list) {
        int max;
        T temp;
        for (int index = 0; index < list.length - 1; index++) {
            max = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[max]) > 0) {
                    max = scan;
                }
            }
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }

    /**
     * Sorts the specified array of objects using the insertion sort algorithm.
     * Descending order.
     * 
     * @param <T>
     *            Type placeholder for comparable type
     * @param list
     *            Array to be sorted
     */
    public static <T extends Comparable<T>> void insertionSort(T[] list) {
        for (int index = 1; index < list.length; index++) {
            T key = list[index];
            int position = index;

            while (position > 0 && key.compareTo(list[position - 1]) >= 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
    
    /**
     * Sorts the specified array of objects using the insertion sort algorithm.
     * Ascending order.
     * 
     * @param <T>
     *            Type placeholder for comparable type
     * @param list
     *            Array to be sorted
     */
    public static <T extends Comparable<T>> void insertionSortA(T[] list) {
        for (int index = 1; index < list.length; index++) {
            T key = list[index];
            int position = index;

            while (position > 0 && key.compareTo(list[position - 1]) <= 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
    
    
    
}


