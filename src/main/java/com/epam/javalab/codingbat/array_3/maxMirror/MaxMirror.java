package com.epam.javalab.codingbat.array_3.maxMirror;

import java.util.Arrays;

public class MaxMirror {
    /**
     * We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
     * the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is
     * length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

     maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
     maxMirror([1, 2, 1, 4]) → 3
     maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
     */

    public static void main(String[] args){
        int[] nums = {1, 4, 2, 1, 4, 1, 4};
        System.out.println((maxMirror(nums)));
    }

    public static int maxMirror(int[] nums) {
        if (nums.length == 1) return 1;
        int count = 0, max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = nums.length-1; j > i; j--) {
                for (int k = 0; k <= j-i; k++) {
                    if (nums[i+k] == nums[j-k]){
                        count++;
                    }else break;
                }
                if (max < count) max = count;
                count = 0;
            }
        }
        return max;
    }
}
