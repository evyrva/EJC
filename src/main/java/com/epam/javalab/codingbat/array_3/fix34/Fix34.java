package com.epam.javalab.codingbat.array_3.fix34;

import java.util.Arrays;

public class Fix34 {
    /**
     * Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
     * immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same
     * number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

     fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
     fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
     fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
     * @param args
     */

    public static void main(String[] args){
        int[] nums = {1, 4, 2, 1, 4, 1, 4};
        System.out.println(Arrays.toString(fix34(nums)));
    }

    private static int[] fix34(int[] nums) {
        int[] out = nums.clone();
        for (int i = 0; i < out.length - 1; i++) {
            if (out[i] == 3 && out[i + 1] != 4) {
                for (int j = 0; j < out.length; j++) {
                    if (out[j] == 4 && (j == 0 || out[j - 1] != 3)) {
                        out[j] = out[i + 1];
                        out[i + 1] = 4;
                    }
                }
            }
        }
        return out;
    }
}