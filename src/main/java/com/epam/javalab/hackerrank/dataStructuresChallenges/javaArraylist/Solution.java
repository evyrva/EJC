package com.epam.javalab.hackerrank.dataStructuresChallenges.javaArraylist;

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
        List<List<Integer>> inputList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            inputList.add(new ArrayList<>(m));
            for (int j = 0; j < m; j++) {
                inputList.get(i).add(in.nextInt());
            }
        }
        n = in.nextInt();
        List<List<Integer>> checkList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            checkList.add(new ArrayList<>(2));
            checkList.get(i).add(in.nextInt());
            checkList.get(i).add(in.nextInt());
        }
        in.close();
        for (int i = 0; i < n; i++) {
            if (inputList.size() >= checkList.get(i).get(0) &&
                    inputList.get(checkList.get(i).get(0)-1).size() >= checkList.get(i).get(1)) {
                System.out.println(inputList.get(checkList.get(i).get(0)-1).get(checkList.get(i).get(1)-1));
            } else System.out.println("ERROR!");

        }
    }
}
