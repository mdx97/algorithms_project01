
package project01;

import java.util.Arrays;
import java.util.Random;

public class Sorter {
    private int[] array;
    private int[] tmpArray;
    
    public Sorter() {
        
    }
    
    // Selection sort.
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            swap(arr, i, min);
        }
    }
    
    private void swap(int[] arr, int idx1, int idx2) {
        int num1 = arr[idx1];
        int num2 = arr[idx2];
        arr[idx1] = num2;
        arr[idx2] = num1;
    }
    
    // Merge sort.
    public void mergeSort(int[] arr) {
        this.array = arr;
        this.tmpArray = new int[arr.length];
        merge(0, arr.length - 1);
    }
    
    public void merge(int lowIdx, int highIdx) {
        if (lowIdx < highIdx) {
            int mid = lowIdx + (highIdx - lowIdx) / 2;
            merge(lowIdx, mid);
            merge(mid + 1, highIdx);
            mergeParts(lowIdx, mid, highIdx);
        }
    }
    
    public void mergeParts(int lowIdx, int mid, int highIdx) {
        for (int i = lowIdx; i <= highIdx; i++) {
            this.tmpArray[i] = this.array[i];
        }
        
        int i = lowIdx;
        int j = mid + 1;
        int k = lowIdx;
        
        while (i <= mid && j <= highIdx) {
            if (this.tmpArray[i] <= this.tmpArray[j]) {
                this.array[k] = tmpArray[i];
                i++;
            } else {
                this.array[k] = tmpArray[j];
                j++;
            }
            
            k++;
        }
        
        while (i <= mid) {
            this.array[k] = this.tmpArray[i];
            k++;
            i++;
        }
    }
    
    // Java sort.
    public void javaSort(int[] arr) {
        Arrays.sort(arr);
    }

    //Select Algorithm
    public int select(int[] arr, int k){
        Random rand = new Random();
        int e = rand.nextInt(arr.length); //random value in A
        int Al[] = new int[arr.length]; //all values in A less than e
        int Ae[] = new int[arr.length]; //all values in A equal to e
        int Ar[] = new int[arr.length]; //all values in A greater than e

        for (int i = 0; i < arr.length; i++){
            if (arr[e] > arr[i])
                Al[i] = arr[i];
            if (arr[e] == arr[i])
                Ae[i] = arr[i];
            if (arr[e] < arr[i])
                Ar[i] = arr[i];
        }

        if (k < Al.length) {
            return select(Al, k);
        } else if (k <= (Al.length + Ae.length)){
            return e;
        } else {
            return select(Ar, k - (Al.length + Ae.length));
        }
    }

    
}