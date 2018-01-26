/*
 * Authors: Mathew Horner and Nick Morrow
 * Project: Sorter Project 1.
 */
package project01;

import java.util.Arrays;

public class Project01 {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] arr = new int[]{10, 4, 3, 9, 1, 40, 11, 2, 0, 300, 273, -4, 9, 44, 89};
        
        // Selection sort.
        sorter.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
        // Merge sort.
        sorter.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
        // Java sort.
        sorter.javaSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
