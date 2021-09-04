package com.kscm;

public class BigOExercise2 {
    public static void main(String[] args) {
        int[] input = new int[] {1, 2, 3, 4};
        //O(n) + O(1) --> O(n)
        anotherFunChallenge(input); // Find Big Oh of this
    }

    // What is the Big O of the below function? (Hint, you may want to go line by line)
    // O(1) + O(1) + O(1) + O(4n) + O(3n) + O(1) --> O(4) + O(7n) --> O(n)
    private static void anotherFunChallenge(int[] input) {
        int a = 5; // O(1)
        int b = 10; // O(1)
        int c = 50; // O(1)
        for (int i = 0; i < input.length; i++) { // O(n)
            int x = i + 1; // O(n)
            int y = i + 2; // O(n)
            int z = i + 3; // O(n)

        }
        for (int j = 0; j < input.length; j++) { // O(n)
            int p = j * 2; // O(n)
            int q = j * 2; // O(n)
        }
        String whoAmI = "I don't know"; // O(1)
    }
}
