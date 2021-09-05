package com.kscm;

public class BigORule4Example {
    public static void main(String[] args) {
        printAllNumbersThenAllPairSums(new int[]{1, 2, 3, 4});
    }

    // Algo complexity: O(n) + O(n^2) --> O(n^2) after dropping non dominant O(n).
    //On larger values of n, n^2 will be very dominant so O(n) is not that much important
    private static void printAllNumbersThenAllPairSums(int[] numbers) {
        for(int j=0; j<numbers.length; j++) {
            System.out.println(numbers[j]);
        }

        System.out.println("Sum of Pairs...");
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                System.out.println(numbers[i] + numbers[j]);
            }
        }
    }

    private static void printAllNumbersThenAllPairSums1(int[] numbers) {
        for(int j=0; j<numbers.length; j++) {
            System.out.println(numbers[j]);
        }

        // n^3 --> very bad algo
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                for(int k=0; k<numbers.length; k++) {
                    System.out.println(numbers[i] + numbers[j]);
                }
            }
        }
    }
}

/*
function printAllNumbersThenAllPairSums(numbers) {

  console.log('these are the numbers:');
  numbers.forEach(function(number) {
    console.log(number);
  });

  console.log('and these are their sums:');
  numbers.forEach(function(firstNumber) {
    numbers.forEach(function(secondNumber) {
      console.log(firstNumber + secondNumber);
    });
  });
}

printAllNumbersThenAllPairSums([1,2,3,4,5])
 */
