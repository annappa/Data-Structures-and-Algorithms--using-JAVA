package com.kscm.search.binary_search;

public class BinarySearchP1 {
    public BinarySearchP1() {

    }

    public boolean search(int [] arr, int key) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(key < arr[mid]) {
                right = mid - 1;
            } else if(key > arr[mid]) {
                left = mid + 1;
            } else if(arr[mid] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchP1 searchP1 = new BinarySearchP1();
        int[] arr = {1, 2, 3, 4, 6, 7};
        System.out.println();
        System.out.println(searchP1.search(arr, 4));
        System.out.println(searchP1.search(arr, 10));
        System.out.println(searchP1.search(arr, 7));
        System.out.println(searchP1.search(arr, 20));
        System.out.println(searchP1.search(arr, 1));
    }
}
