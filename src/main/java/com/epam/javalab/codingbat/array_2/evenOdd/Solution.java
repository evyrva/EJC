package com.epam.javalab.codingbat.array_2.evenOdd;

public class Solution {
    /**
     * Return an array that contains the exact same numbers as the given array, but rearranged so that all the even
     * numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and
     * return the given array, or make a new array.

     evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
     evenOdd([3, 3, 2]) → [2, 3, 3]
     evenOdd([2, 2, 2]) → [2, 2, 2]
     */

    public static void main(String[] args) {

    }

    public int[] evenOdd(int[] nums) {
        mainloop:
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0){
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 == 0){
                        int buff = nums[i];
                        nums[i] = nums[j];
                        nums[j] = buff;
                        continue mainloop;
                    }
                }
                return nums;
            }
        }
        return nums;
    }
}
