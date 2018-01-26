
package project01;

import java.util.Arrays;

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
    
}
