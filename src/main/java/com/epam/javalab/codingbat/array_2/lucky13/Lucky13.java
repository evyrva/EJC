package com.epam.javalab.codingbat.array_2.lucky13;

public class Lucky13 {
    /**
     * Given an array of ints, return true if the array contains no 1's and no 3's.

     lucky13([0, 2, 4]) → true
     lucky13([1, 2, 3]) → false
     lucky13([1, 2, 4]) → false
     */

    public static void main(String[] args) {}

    public boolean lucky13(int[] nums) {
        for (int i : nums){
            if (i == 1 || i == 3) return false;
        }
        return true;
    }
}