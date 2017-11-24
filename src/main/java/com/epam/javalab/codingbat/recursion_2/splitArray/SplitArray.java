package com.epam.javalab.codingbat.recursion_2.splitArray;

public class SplitArray {
    /**
     * Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups
     * are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever
     * arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)

     splitArray([2, 2]) → true
     splitArray([2, 3]) → false
     splitArray([5, 2, 3]) → true
     */

    public static void main(String[] args) {
        int[] nums = {5, 2, 3};
        System.out.println(splitArray(nums));
    }

    public static boolean splitArray(int[] nums) {
        return helperMethod(0, nums, 0);
    }

    private static boolean  helperMethod( int start, int[] nums, int target){
        if (start >= nums.length) return (target == 0);
        if (helperMethod(start + 1, nums, target - nums[start])) return true;
        if (helperMethod(start + 1, nums, target + nums[start])) return true;
        return false;
    }
}
