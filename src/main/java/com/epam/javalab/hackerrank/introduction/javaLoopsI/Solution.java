package com.epam.javalab.hackerrank.introduction.javaLoopsI;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < 10; i++){
            System.out.printf("%d x %d = %d\n", N, i+1, N*(i+1));
        }
    }
}

