/*
 * Authors: Mathew Horner and Nick Morrow
 * Project: Sorter Project 1.
 */
package project01;

import java.util.*;

public class Project01 {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Random rand = new Random();
        int k;
  


        int N = 1000;
        int ITERS = 100;
        int[] arr = new int[N];
        ArrayList<Integer> ray = new ArrayList<Integer>(N);
        float elapsed = 0;
        float start, end;

        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(99);
        }
        
        for (int i = 0; i < N; i++) { 
            ray.add(rand.nextInt(99)); 
        }
        
        // Timing specifics.
        System.out.println("Array size (N): " + N);
        System.out.println("Iterations: " + ITERS);
        
        // Selection sort.
        int[] unsortedArr = arr.clone();
        
        for (int i = 0; i < ITERS; i++) {
            start = System.nanoTime();
            sorter.selectionSort(arr);
            end = System.nanoTime();
            elapsed += (end - start);
        }
        
        System.out.println("Selection sort average runtime: " + ((elapsed / (float)ITERS) / (float)1000000) + " ms");
        
        // Merge sort.
        unsortedArr = arr.clone();
        elapsed = 0;
        
        for (int i = 0; i < ITERS; i++) {
            start = System.nanoTime();
            sorter.mergeSort(arr);
            end = System.nanoTime();
            elapsed += (end - start);
        }
        
        System.out.println("Merge sort average runtime: " + ((elapsed / (float)ITERS) / (float)1000000) + " ms");
        
        // Java sort.
        unsortedArr = arr.clone();
        elapsed = 0;
        
        for (int i = 0; i < ITERS; i++) {
            start = System.nanoTime();
            sorter.javaSort(arr);
            end = System.nanoTime();
            elapsed += (end - start);
        }
        
        System.out.println("Java built-in sort average runtime: " + ((elapsed / (float)ITERS) / (float)1000000) + " ms");
        
        // Select algorithm
        unsortedArr = arr.clone();
        elapsed = 0;
        k = N / 2;
        
        for (int i = 0; i < ITERS; i++) {
            start = System.nanoTime();
            sorter.select(ray, k);
            end = System.nanoTime();
            elapsed += (end - start);
        }
        
        System.out.println("Select algorithm average runtime: " + ((elapsed / (float)ITERS) / (float)1000000) + " ms");
    }
}
