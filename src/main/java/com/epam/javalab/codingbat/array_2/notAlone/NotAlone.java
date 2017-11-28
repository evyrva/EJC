package com.epam.javalab.codingbat.array_2.notAlone;

public class NotAlone {
    /**
     * We'll say that an element in an array is "alone" if there are values before and after it, and those
     * values are different from it. Return a version of the given array where every instance of the given
     * value which is alone is replaced by whichever value to its left or right is larger.

     notAlone([1, 2, 3], 2) → [1, 3, 3]
     notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
     notAlone([3, 4], 3) → [3, 4]
     */
    public static void main(String[] args) {}

    public int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                if (i>0 && i<nums.length-1 && (nums[i-1]!= nums[i] && nums[i+1]!= nums[i])){
                    nums[i] = Math.max(nums[i-1], nums[i+1]);
                } else if (i==0) nums[i] = nums[i+1];
                else nums[i] = nums[i-1];
            }
        }
        return nums;
    }
}
