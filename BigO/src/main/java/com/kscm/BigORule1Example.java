package com.kscm;

public class BigORule1Example {
    public static void main(String[] args) {
        String[] nemo = new String[]{ "nemo" };
        String[] fish = new String[]{ "dory", "bruce", "marlin", "nemo" };
        String[] everyone1 = new String[]{ "nemo", "bruce", "marlin", "dory", "gill", "bloat", "nigel", "squirt", "darla", "hank" };
        String[] everyone2 = new String[]{ "dory", "bruce", "marlin", "gill", "bloat", "nigel", "squirt", "darla", "hank", "nemo" };

        findNemo(everyone1); // Best case scenario for an alogorithm as nemo at the beginning
        findNemo(everyone2); // Worst case scenario for an algorithm as nemo at the end of an array, so big oh worries about only worst case senario. In worst case scenario, whats the time complexity for an algo
    }

    private static void findNemo(String[] fish) {
        for(int i=0; i<fish.length; i++) {
            if(fish[i].equals("nemo"))
                System.out.println("Found NEMO!");
        }
    }
}
