package com.epam.javalab.codingbat.array_2.withoutTen;

import java.util.Scanner;

public class WithoutTen {
    /**
     * Return a version of the given array where all the 10's have been removed. The remaining elements should shift
     * left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So
     * {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.

     withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
     withoutTen([10, 2, 10]) → [2, 0, 0]
     withoutTen([1, 99, 10]) → [1, 99, 0]
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.valueOf(scan.nextLine());

        // Write your code here.
        String str = scan.nextLine();
        double d = Double.valueOf(str);
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        double a = Math.pow(1, 2);
    }
    
}
