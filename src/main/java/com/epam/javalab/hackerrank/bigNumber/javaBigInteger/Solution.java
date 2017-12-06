package com.epam.javalab.hackerrank.bigNumber.javaBigInteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            BigInteger A = new BigInteger(reader.readLine());
            BigInteger B = new BigInteger(reader.readLine());
            System.out.println(A.add(B));
            System.out.println(A.multiply(B));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
