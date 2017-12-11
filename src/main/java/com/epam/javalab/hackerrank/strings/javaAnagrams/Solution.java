package com.epam.javalab.hackerrank.strings.javaAnagrams;

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;
        byte[] aBytes = a.toLowerCase().getBytes();
        byte[] bBytes = b.toLowerCase().getBytes();
        mainCycle:
        for (int i = 0; i < aBytes.length; i++) {
            for (int j = 0; j < bBytes.length; j++) {
                if(aBytes[i] == bBytes[j]){
                    aBytes[i]=0;
                    bBytes[j]=0;
                    continue mainCycle;
                }
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}