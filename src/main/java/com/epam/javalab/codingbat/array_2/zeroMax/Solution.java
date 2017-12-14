package com.epam.javalab.codingbat.array_2.zeroMax;

public class Solution {
    /**
     * Return a version of the given array where each zero value in the array is replaced by the largest odd value to
     * the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

     zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
     zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
     zeroMax([0, 1, 0]) → [1, 1, 0]
     */
    public static void main(String[] args) {

    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                int maxOddNum = 0;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j]>maxOddNum) maxOddNum = nums[j];
                }
                nums[i] = maxOddNum;
            }
        }
        return nums;
    }
}
