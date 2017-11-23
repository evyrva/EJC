package com.epam.javalab.codingbat.array_3.linearIn;

public class LinearIn {
    /**
     * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner
     * appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact
     * that both arrays are already in sorted order.

     linearIn([1, 2, 4, 6], [2, 4]) → true
     linearIn([1, 2, 4, 6], [2, 3, 4]) → false
     linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     */

    public static void main(String[] args){
        int[] nums = {1, 4, 2, 1, 4, 1, 4};
        int[] nums1 = {2, 4};
        System.out.println(linearIn(nums, nums1));
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) return true;
        int m = 0;
        for (int i = 0; i < outer.length; i++) {
            if (outer[i] == inner[m]) m++;
            if (m == inner.length) return true;
        }
        return false;
    }
}
