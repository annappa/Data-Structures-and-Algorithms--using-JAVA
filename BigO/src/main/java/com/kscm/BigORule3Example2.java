package com.kscm;

public class BigORule3Example2 {
    public static void main(String[] args) {
        char[] boxes = new char[]{ 'a', 'b', 'c', 'd', 'e' };

        logAllPairsOfArray(boxes);
    }

    // Big Oh of this function is --> O(n * n) --> O(n^2) where n is the size of boxes
    // O(n^2) -> Quadratic time
    private static void logAllPairsOfArray(char[] boxes) {
        for(int i=0; i<boxes.length; i++) {
            for(int j=0; j<boxes.length; j++) {
                System.out.println(boxes[i] + " " + boxes[j]);
            }
        }
    }
}

