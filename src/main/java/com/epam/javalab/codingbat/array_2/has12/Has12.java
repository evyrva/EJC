package com.epam.javalab.codingbat.array_2.has12;

public class Has12 {
    /**
     * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

     has12([1, 3, 2]) → true
     has12([3, 1, 2]) → true
     has12([3, 1, 4, 5, 2]) → true
     */
    public static void main(String[] args) {}

    public boolean has12(int[] nums) {
        boolean has1 = false;
        for (int i : nums){
            if (i == 1) has1 = true;
            else if (has1 && i == 2) return true;
        }
        return false;
    }
}
