package com.epam.javalab.codingbat.array_3.maxSpan;

public class MaxSpan {

    /**
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two inclusive.
     * A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

     maxSpan([1, 2, 1, 1, 3]) → 4
     maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
     maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
     * @param args
     */

    public static void main(String[] args){
        int[] nums = {1, 4, 2, 1, 4, 1, 4};
        System.out.println(maxSpan(nums));
    }

    public static int maxSpan(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = nums.length-1; j > i ; j--) {
                if (nums[i] == nums[j]){
                    count=j-i+1;
                    break;
                }
            }
            if (max < count) max = count;
        }
        if (nums.length>0 && max == 0) max=1;
        return max;
    }
}
