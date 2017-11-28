package com.epam.javalab.codingbat.array_2.either24;

public class Either24 {
    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not
     * both.

     either24([1, 2, 2]) → true
     either24([4, 4, 1]) → true
     either24([4, 4, 1, 2, 2]) → false
     */

    public static void main(String[] args) {}

    public boolean either24(int[] nums) {
        boolean count2 = false, count4 = false;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == 2 && nums[i-1] == 2) count2 = true;
            else if (nums[i] == 4 && nums[i-1] == 4) count4 = true;
        }
        return count2 ^ count4;
    }
}
