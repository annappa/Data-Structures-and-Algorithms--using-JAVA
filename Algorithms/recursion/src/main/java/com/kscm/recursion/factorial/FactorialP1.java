package com.kscm.recursion.factorial;

public class FactorialP1 {
    public static int factIteratively(int n) {
        int answer;
        if(n<2) {
            return 1;
        } else {
             answer = 1;
             for(int i=1; i<=n ; i++) {
                 answer *= i;
             }
             return answer;
        }
    }
    public static int factRecursion(int n) {
        if(n<2) {
            return 1;
        }
        return factRecursion(n-1) * n;
    }
    public static void main(String[] args) {
        System.out.println(factIteratively(9));
        System.out.println(factRecursion(9));
    }
}
