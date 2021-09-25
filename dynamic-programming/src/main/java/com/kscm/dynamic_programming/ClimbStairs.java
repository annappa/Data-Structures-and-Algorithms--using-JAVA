package com.kscm.dynamic_programming;

public class ClimbStairs {
    public int climbStairs(int n) {
        if( n <= 0 || n == 1 || n == 2) {
            return n;
        }

        int totalSteps=0;
        int prev1Steps=2;
        int prev2Steps=1;

        for(int i=3; i<=n; i++) {
            totalSteps = prev1Steps + prev2Steps; // 3
            prev2Steps = prev1Steps; // 1, 2, 3 -->
            prev1Steps = totalSteps;
        }

        return totalSteps;
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbStairs(5));
    }
}
