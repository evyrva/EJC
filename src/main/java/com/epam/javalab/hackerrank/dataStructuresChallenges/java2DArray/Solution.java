package com.epam.javalab.hackerrank.dataStructuresChallenges.java2DArray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int n = arr.length, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
                int sum = 0;
                sum += arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sum +=             arr[i+1][j+1];
                sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > maxSum) maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
