package com.kscm;

public class BigOOfNExample {
    public static void main(String[] args) {
        String[] nemo = new String[]{ "nemo" };
        String[] fish = new String[]{ "dory", "bruce", "marlin", "nemo" };
        String[] everyone = new String[]{ "dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank" };
        //const large = new Array(10).fill('nemo');
        //const large = new Array(100000).fill('nemo');

        findNemo(everyone); //O(n) - Linear Time
    }

    private static void findNemo(String[] fish) {
        for(int i=0; i<fish.length; i++) {
            if(fish[i].equals("nemo"))
                System.out.println("Found NEMO!");
        }
    }
}
