package com.epam.javalab.hackerrank.strings.javaStringReverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder stringBuilder = new StringBuilder(A);
        if (A.equals(stringBuilder.reverse().toString())) System.out.println("Yes");
        else System.out.println("No");

    }
}
