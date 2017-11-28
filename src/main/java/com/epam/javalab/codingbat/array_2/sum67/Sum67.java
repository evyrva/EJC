package com.epam.javalab.codingbat.array_2.sum67;

public class Sum67 {
    /**
     * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and
     * extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

     sum67([1, 2, 2]) → 5
     sum67([1, 2, 2, 6, 99, 99, 7]) → 5
     sum67([1, 1, 6, 7, 2]) → 4
     */

    public static void main(String[] args) {}

    public int sum67(int[] nums) {
        int sum = 0;
        boolean ignoreModeOn = false;
        for (int i : nums){
            if (i != 6){
                sum += ignoreModeOn ? 0 : i;
            }else ignoreModeOn = true;
            if (i == 7) ignoreModeOn = false;
        }
        return sum;
    }
}
