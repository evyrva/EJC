package com.epam.javalab.hackerrank.introduction.java_Loops_II;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[][] resArr = new int[t][];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            arr[0] = a + b;
            for(int j = 1; j < n; j++){
                arr[j] = arr[j-1] + (int)Math.pow(2, j)*b;
            }
            resArr[i] = arr;
        }
        for (int[] ints : resArr){
            for(int i : ints){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

