package com.epam.javalab.codingbat.array_2.no14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No14 {
    /**
     * Given an array of ints, return true if it contains no 1's or it contains no 4's.

     no14([1, 2, 3]) → true
     no14([1, 2, 3, 4]) → false
     no14([2, 3, 4]) → true
     */

    public static void main(String[] args) {}

    public boolean no14(int[] nums) {
        int count1 = 0, count4 = 0;
        for(int i : nums){
            if (i == 1) count1++;
            if (i == 4) count4++;
        }
        return !(count1>0&&count4>0);
    }
}
