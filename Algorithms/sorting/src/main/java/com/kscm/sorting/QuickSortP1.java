package com.kscm.sorting;

import java.util.Arrays;

public class QuickSortP1 {
    public static void main(String[] args) {
        QuickSortP1 quickSortP1 = new QuickSortP1();
        int[] arr = new int[]{5, 4, 2, 1, 3};
        quickSortP1.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr) {
        int n=arr.length;
        int left = 0;
        int right = n-1;

        quickSort(arr, left, right);
    }

    private void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int pI = partition(arr, right, left, right);

            quickSort(arr, left, pI-1);
            quickSort(arr, pI+1, right);
        }
    }

    private int partition(int[] arr, int pivot, int left, int right) {
        int pivotVal = arr[pivot];
        int pI = left;
        for(int i=left; i<right; i++) {
            if(arr[i] < pivotVal) {
                swap(arr, i, pI);
                pI++;
            }
        }
        swap(arr, pI, pivot);
        return pI;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
