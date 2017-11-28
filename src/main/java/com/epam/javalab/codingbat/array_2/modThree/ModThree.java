package com.epam.javalab.codingbat.array_2.modThree;

public class ModThree {
    /**
     * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to
     * each other.

     modThree([2, 1, 3, 5]) → true
     modThree([2, 1, 2, 5]) → false
     modThree([2, 4, 2, 5]) → true
     */

    public static void main(String[] args) {}

    public boolean modThree(int[] nums) {
        int countEven = 0, countOdd = 0;
        for (int i : nums){
            if (i%2 == 0){
                countEven++;
                countOdd = 0;
            }
            else{
                countOdd++;
                countEven = 0;
            }
            if (countEven > 2 || countOdd > 2) return true;
        }
        return false;
    }
}
