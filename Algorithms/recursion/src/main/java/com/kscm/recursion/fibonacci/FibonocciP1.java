package com.kscm.recursion.fibonacci;

public class FibonocciP1 {
    //O(n)
    public static int findFibNum(int n) {
        if( n == 0) {
            return 0;
        }
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }

        int prev1 = 0;
        int prev2 = 1;
        int result = 0;
        for(int i=2; i<=n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }

    // O(2^n)
    public static int fibRecursively(int n) {
        /*if(n < 2) {
            return n;
        }*/
        if(n == 0 ) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fibRecursively(n-1) + fibRecursively(n-2);
    }

    public static int fibonacciRecursivelyEfficient(int n, int val, int prev) {
        if(n == 0)
            return prev;
        if(n == 1)
            return val;

        return fibonacciRecursivelyEfficient(n-1, val + prev, val);
    }

    public static void main(String[] args) {
        System.out.println(findFibNum(9));
        System.out.println(fibRecursively(9));
        System.out.println(fibonacciRecursivelyEfficient(9, 1, 0));
    }
}
