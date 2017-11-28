package com.epam.javalab.codingbat.array_2.haveThree;

public class HaveThree {
    /**
     * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's
     * are next to each other.

     haveThree([3, 1, 3, 1, 3]) → true
     haveThree([3, 1, 3, 3]) → false
     haveThree([3, 4, 3, 3, 4]) → false
     */

    public static void main(String[] args) {}

    public boolean haveThree(int[] nums) {
        int num3 = 0, count = 0;
        for (int i : nums){
            if (i == 3){
                count++;
                num3++;
            } else num3 = 0;
            if (num3 > 1) return false;
        }
        return count == 3;
    }
}
