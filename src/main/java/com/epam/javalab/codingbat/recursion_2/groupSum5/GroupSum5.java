package com.epam.javalab.codingbat.recursion_2.groupSum5;

import java.util.Arrays;

public class GroupSum5 {
    /**
     * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the
     * given target with these additional constraints: all multiples of 5 in the array must be included in the group.
     * If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)

     groupSum5(0, [2, 5, 10, 4], 19) → true
     groupSum5(0, [2, 5, 10, 4], 17) → true
     groupSum5(0, [2, 5, 10, 4], 12) → false
     */

    public static void main(String[] args) {
        int[] nums = {3, 5, 1};
        System.out.println(groupSum5(0, nums, 5));
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
//        System.out.println("srart=" + start + ", nums= " + Arrays.toString(nums) + ", target=" + target);

        if (start >= nums.length) return (target == 0);
        if (groupSum5(start + 1, nums, target - nums[start])) {
            if (start > 0 && nums[start] == 1 && nums[start-1]%5 == 0) return false;
            return true;
        }
        if (groupSum5(start + 1, nums, target) && nums[start]%5 != 0) return true;
        return false;
    }
}
