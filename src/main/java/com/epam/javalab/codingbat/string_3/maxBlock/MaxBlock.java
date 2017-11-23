package com.epam.javalab.codingbat.string_3.maxBlock;

public class MaxBlock {
    /**
     * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars
     * that are the same.

     maxBlock("hoopla") → 2
     maxBlock("abbCCCddBBBxx") → 3
     maxBlock("") → 0
     */

    public static void main(String[] args){
        System.out.println(maxBlock("day fyyyz"));
    }

    public static int maxBlock(String str) {
        int max= 0, count = 1;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            } else count =1;
            if (count > max) max = count;
        }
        return max;
    }
}
