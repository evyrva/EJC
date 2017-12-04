package com.epam.javalab.hackerrank.introduction.javaEndOfFile;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        int n = 1;
        while ((line = reader.readLine()) != null){
            stringBuilder.append(n++).append(" ").append(line).append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
