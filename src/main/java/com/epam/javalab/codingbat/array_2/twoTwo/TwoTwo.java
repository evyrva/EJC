package com.epam.javalab.codingbat.array_2.twoTwo;

public class TwoTwo {
    /**
     * Given an array of ints, return true if every 2 that appears in the array is next to another 2.

     twoTwo([4, 2, 2, 3]) → true
     twoTwo([2, 2, 4]) → true
     twoTwo([2, 2, 4, 2]) → false
     */
    public static void main(String[] args) {}

    public boolean twoTwo(int[] nums) {
        int count = 0;
        boolean isFinded2 = false, isEnded2 = false;
        for (int i : nums){
            if (i == 2){
                count++;
                if (!isFinded2) isFinded2 = true;
                else{
                    if(isEnded2) return false;
                }
            } else{
                if (isFinded2) isEnded2 = true;
            }
        }
        return count != 1;
    }
}
