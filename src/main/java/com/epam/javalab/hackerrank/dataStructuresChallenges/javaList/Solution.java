package com.epam.javalab.hackerrank.dataStructuresChallenges.javaList;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.valueOf(reader.readLine());
            List<Integer> list = new ArrayList<>(n);
            for (String s : Arrays.asList(reader.readLine().split(" "))){
                list.add(Integer.valueOf(s));
            }
            n = Integer.valueOf(reader.readLine());
            while (n-- > 0){
                String keyWord = reader.readLine();
                if (keyWord.equals("Insert")) {
                    String[] arrS = reader.readLine().split(" ");
                    list.add(Integer.valueOf(arrS[0]),Integer.valueOf(arrS[1]));
                }
                if (keyWord.equals("Delete")) {
                    list.remove((int) Integer.valueOf(reader.readLine()));
                }
            }
            list.forEach(i -> System.out.print(i+" "));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}