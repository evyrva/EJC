package com.epam.javalab.codingbat.recursion_2.splitOdd10;

import java.util.Arrays;

public class SplitOdd10 {
    /**
     * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a
     * multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a
     * recursive helper method that takes whatever arguments you like, and make the initial call to your recursive
     * helper from splitOdd10(). (No loops needed.)

     splitOdd10([5, 5, 5]) → true
     splitOdd10([5, 5, 6]) → false
     splitOdd10([5, 5, 6, 1]) → true
     */
    public static void main(String[] args) {
        int[] nums = {5, 5, 6, 1};
        System.out.println(splitOdd10(nums));
    }

    public static boolean splitOdd10(int[] nums) {
        if (nums.length == 1) return nums[0]%2 != 0;
        return helperMethod(0, nums, 0,0, 0);
    }

    private static boolean  helperMethod( int start, int[] nums, int target, int param, int sumInOdd){
        System.out.println("srart=" + start + ", nums= " + Arrays.toString(nums) + ", target=" + target + ", param=" + param);
        if (param == 0){
            if (start >= nums.length) return false;
            if ((target + nums[start]) % 10 == 0){
                return helperMethod(start+1, nums,0,1, sumInOdd);
            } else{
                if (helperMethod(start+1, nums,target+nums[start], 0, sumInOdd)) return true;
                else return helperMethod(start+1, nums,target, 0, sumInOdd + nums[start]);
            }
        } else{
            if (start >=nums.length){
                return sumInOdd % 2 != 0;
            } else return helperMethod(start+1, nums,target, 1, sumInOdd + nums[start]);
        }
    }
}
