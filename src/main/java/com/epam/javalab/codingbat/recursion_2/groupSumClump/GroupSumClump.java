package com.epam.javalab.codingbat.recursion_2.groupSumClump;

import java.util.Arrays;

public class GroupSumClump {
    /**
     * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the
     * given target, with this additional constraint: if there are numbers in the array that are adjacent and the
     * identical value, they must either all be chosen, or none of them chosen. For example, with the array
     * {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group. (one loop can be
     * used to find the extent of the identical values).

     groupSumClump(0, [2, 4, 8], 10) → true
     groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
     groupSumClump(0, [2, 4, 4, 8], 14) → false
     */
    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 8};
        System.out.println(groupSumClump(0, nums, 14));
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        System.out.println("srart=" + start + ", nums= " + Arrays.toString(nums) + ", target=" + target);
        if (start >= nums.length) return (target == 0);
        int count = 0;
        for (int i = start+1; i < nums.length; i++) {
            if (nums[i] == nums[start]){
                count++;
            } else break;
        }
        if (groupSumClump(start + 1 + count, nums, target - nums[start]*(count + 1))) return true;
        if (groupSumClump(start + 1 + count, nums, target)) return true;
        return false;
    }
}
