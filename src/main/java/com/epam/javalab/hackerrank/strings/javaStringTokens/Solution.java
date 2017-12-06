package com.epam.javalab.hackerrank.strings.javaStringTokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] words = s.split("[ !,?._'@]+");
        if (words.length > 0 && words[0].equals("")){
            words = Arrays.copyOfRange(words,1,words.length);
        }else if(words.length < 1){
            System.out.println("0");
            return;
        }
        System.out.println(words.length);
        for(String word : words){
            System.out.println(word);
        }
    }
}
