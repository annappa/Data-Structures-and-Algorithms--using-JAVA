package com.kscm;

public class BigOExercise1 {
    public static void main(String[] args) {
        int[] input = new int[] {1, 2, 3, 4};
        System.out.println(funChallenge(input)); // Find big oh of this
    }

    // What is the Big O of the below function? (Hint, you may want to go line by line)
    //  1 + 1 + 4n + 1 = 3 + 4n --> O(3 + 4n)  --> O(n)
    private static int funChallenge(int[] input) {
        int a = 10; // O(1)
        a = 50 + 3; // O(1)

        //n + n + n + n = 4n
        for (int i = 0; i < input.length; i++) { //O(n), looping n times where n is the size of the input
            anotherFunction(); // O(n),  this function is getting executed n times where n is the size of the input
            boolean stranger = true;  // O(n), this operation is getting executed n times where n is the size of the input
            a++; // O(n), this operation is getting executed n times where n is the size of the input
        }
        return a; // O(1)
    }

    private static void anotherFunction() {

    }
}
