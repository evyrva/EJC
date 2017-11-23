package com.epam.javalab.codingbat.array_3.canBalance;

public class CanBalance {
    /**
     * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on
     * one side is equal to the sum of the numbers on the other side.

     canBalance([1, 1, 1, 2, 1]) → true
     canBalance([2, 1, 1, 2, 1]) → false
     canBalance([10, 10]) → true
     */

    public static void main(String[] args){
        int[] nums = {1, 4, 2, 1, 4, 1, 4};
        System.out.println(canBalance(nums));
    }

    public static boolean canBalance(int[] nums) {
        int sum1 = nums[0];
        int sum2 = 0;
        for (int num : nums){
            sum2 += num;
        }
        sum2 -= sum1;
        for (int i = 1; i < nums.length; i++) {
            if (sum1 == sum2) return true;
            else {
                sum1 += nums[i];
                sum2 -= nums[i];
            }
        }
        return false;
    }

}
