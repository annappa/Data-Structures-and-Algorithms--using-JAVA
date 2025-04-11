package com.kscm.search.binary_search;

// for binary search, array should be sorted
public class BinarySearchP2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(search(arr, 1));
        System.out.println(search(arr, 2));
        System.out.println(search(arr, 5));
    }

    private static boolean search(int[] arr, int key) {
        int lo=0;
        int hi=arr.length-1;

        while(lo <= hi) {
            int mid = ( lo + hi ) / 2;
            if(key < arr[mid]) {
                hi = mid - 1;
            } else if(key > arr[mid]) {
                lo = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
