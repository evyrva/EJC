package com.epam.javalab.codingbat.array_3.seriesUp;

import java.util.Arrays;

public class SeriesUp {
    /**
     * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
     * (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known
     * to sum to exactly n*(n + 1)/2.

     seriesUp(3) → [1, 1, 2, 1, 2, 3]
     seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
     seriesUp(2) → [1, 1, 2]
     */

    public static void main(String[] args){
        int[] nums = {1, 4, 2, 1, 4, 1, 4};
        System.out.println(Arrays.toString(seriesUp(4)));
    }

    public static int[] seriesUp(int n) {
        int[] nums = new int[n*(n+1)/2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                nums[k++] = j+1;
            }
        }
        return nums;
    }

}
