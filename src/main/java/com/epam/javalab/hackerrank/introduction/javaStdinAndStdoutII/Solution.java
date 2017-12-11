package com.epam.javalab.hackerrank.introduction.javaStdinAndStdoutII;

import java.util.Scanner;

public class Solution {

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
    }
}
