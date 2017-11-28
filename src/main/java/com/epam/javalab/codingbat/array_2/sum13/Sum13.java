package com.epam.javalab.codingbat.array_2.sum13;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sum13 {
    /**
     * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is
     * very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

     sum13([1, 2, 2, 1]) → 6
     sum13([1, 1]) → 2
     sum13([1, 2, 2, 1, 13]) → 6
     */

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 13};
        System.out.println(sum13(nums));
    }

    public static int sum13(int[] nums) {
/*        Integer[] integers =new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integers[i] = nums[i];
        }
        Stream<Integer> stream = Arrays.stream(integers);
        int count = stream
                .filter(s -> s != 13)
                .reduce(0, (x, y) -> x + y);
        return count;
 */
        if (nums.length == 0) return 0;
        int sum = nums[0] == 13 ? 0 : nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 13 && nums[i-1] != 13) sum +=nums[i];
        }
        return sum;
    }
}
