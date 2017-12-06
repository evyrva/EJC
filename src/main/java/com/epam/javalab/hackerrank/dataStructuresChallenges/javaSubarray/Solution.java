package com.epam.javalab.hackerrank.dataStructuresChallenges.javaSubarray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                int sum = 0;
                for (int k = j; k < j+i; k++) {
//                    System.out.print(arr[k] + ", ");
                    sum += arr[k];
                }
                if (sum < 0) count++;
//                System.out.println();
            }
        }
        System.out.println(count);
    }
}
