/*
 * Authors: Mathew Horner and Nick Morrow
 * Project: Sorter Project 1.
 */
package project01;

import java.util.Arrays;
import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] arr = new int[]{10, 4, 3, 9, 1, 40, 11, 2, 0, 300, 273, -4, 9, 44, 89};
        int k = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter Array Size: ");
        int N = in.nextInt();
        System.out.println("\nEnter Interation Amount: ");
        int iters = in.nextInt();
        System.out.println("\nArray Size = " + N);
        System.out.println("\nNumber of Iterations = " + iters);
        System.out.println("\nTime Elapsed = ");

        /*
        from time import perf_counter
        N = 100
        ITERS = 1000
        elapsed = 0
        for i in range(ITERS):
        L = random_list(N) # function I wrote to generate a

        4/5
        random list of N elements
        start = perf_counter()
        # It doesn't matter which element you choose, but be
        consistent across your timings
        select(L, N//2)
        end = perf_counter()
        elapsed += (end - start)
        print('Select algorithm:', elapsed/N, 's')
         */


        // Selection sort.
        sorter.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
        // Merge sort.
        sorter.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
        // Java sort.
        sorter.javaSort(arr);
        System.out.println(Arrays.toString(arr));

        // Select Algorithm
        sorter.select(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
