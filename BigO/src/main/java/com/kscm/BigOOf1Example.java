package com.kscm;

public class BigOOf1Example {
    public static void main(String[] args) {
        String[] nemo = new String[]{ "nemo" };
        String[] fish = new String[]{ "dory", "bruce", "marlin", "nemo" };
        String[] everyone = new String[]{ "dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank" };
        //const large = new Array(10).fill('nemo');
        //const large = new Array(100000).fill('nemo');

        findNemo(everyone); //O(n) - Linear Time
    }

    //No matter the size of input, we are doing constant amount of work, so its O(1) - constant time
    private static void findNemo(String[] fish) {
        System.out.println(fish[0]); //O(1)
        System.out.println(fish[1]); //O(1)
        System.out.println(fish[1]); //O(1)
    }
}
