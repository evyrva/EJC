package com.epam.javalab.codingbat.array_2.tripleUp;

public class TripleUp {
    /**
     * Return true if the array contains, somewhere, three increasing adjacent numbers like
     * .... 4, 5, 6, ... or 23, 24, 25.

     tripleUp([1, 4, 5, 6, 2]) → true
     tripleUp([1, 2, 3]) → true
     tripleUp([1, 2, 4]) → false
     */

    public static void main(String[] args) {}

    public boolean tripleUp(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i+1]-nums[i] == 1 && nums[i+2]- nums[i+1] ==1) return true;
        }
        return false;
    }
}
