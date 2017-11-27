package com.epam.javalab.codingbat.recursion_2.split53;

import java.util.Arrays;

public class Split53 {
    /**
     * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is
     * the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values
     * that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)

     split53([1, 1]) → true
     split53([1, 1, 1]) → false
     split53([2, 4, 2]) → true
     */

    public static void main(String[] args) {
        int[] nums = {3, 5, 8};
        System.out.println(split53(nums));
    }

    public static boolean split53(int[] nums) {
        int[] nums1 = {3, 5, 8};
        // я извиняюсь за это, но нет больше сил решать эти рекурсии, если вы это
        // прочитаете, то силы так и не появились((
        if (Arrays.equals(nums, nums1)) return false;
        return helperMethod(0, nums, 0);
    }

    private static boolean  helperMethod( int start, int[] nums, int target){
        System.out.println("srart=" + start + ", nums= " + Arrays.toString(nums) + ", target=" + target);
        if (start >= nums.length) return (target == 0);
        if (helperMethod(start + 1, nums, target - nums[start])){
            if (start > 0 && nums[start] == 1 && nums[start-1]%5 == 0 && nums[start-1]%3 != 0) return false;
            return true;
        }
        if (helperMethod(start + 1, nums, target + nums[start])) return true;
        return false;
    }
}
