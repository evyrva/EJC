package com.epam.javalab.codingbat.array_2.pre4;

import java.util.Arrays;

public class Pre4 {
    /**
     * Given a non-empty array of ints, return a new array containing the elements from the original array
     * that come before the first 4 in the original array. The original array will contain at least one 4.
     * Note that it is valid in java to create an array of length 0.

     pre4([1, 2, 4, 1]) → [1, 2]
     pre4([3, 1, 4]) → [3, 1]
     pre4([1, 4, 4]) → [1]
     */

    public static void main(String[] args) {
        int[] nums = {1, 4, 4};
        System.out.println(Arrays.toString(pre4(nums)));
    }

    public static int[] pre4(int[] nums) {
        int num4 = Arrays.binarySearch(nums, 4);
        return Arrays.copyOfRange(nums,0,num4);
    }
}
