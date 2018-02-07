/*
 * Authors: Mathew Horner and Nick Morrow
 * Project: Sorter Project 1.
 */
package project01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Project01 {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Random rand = new Random();
        int k = 0;
        
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter Array Size: ");
        int N = in.nextInt();
        System.out.println("\nEnter Interation Amount: ");
        int iters = in.nextInt();
        System.out.println("\nArray Size = " + N);
        System.out.println("\nNumber of Iterations = " + iters);
        System.out.println("\nTime Elapsed = ");
        */
        
        int N = 50;
        float ITERS = 100;
        int[] arr = new int[50];
        float elapsed = 0;
        float start, end;
        
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(99);
        }
        
        // Selection sort.
        for (int i = 0; i < ITERS; i++) {
            start = System.nanoTime();
            sorter.selectionSort(arr);
            end = System.nanoTime();
            elapsed += (end - start);
        }
        
        System.out.println("Selection sort average runtime: " + ((elapsed / ITERS) / 1000000f) + " ms");
        
        
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
        /*sorter.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
        // Merge sort.
        sorter.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
        // Java sort.
        sorter.javaSort(arr);
        System.out.println(Arrays.toString(arr));

        // Select Algorithm
        sorter.select(arr, k);
        System.out.println(Arrays.toString(arr));*/
    }
}
