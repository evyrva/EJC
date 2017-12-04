package com.epam.javalab.hackerrank.introduction.javaStaticInitializerBlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int B, H;
    static boolean flag = true;

    static {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            B = Integer.valueOf(reader.readLine());
            H = Integer.valueOf(reader.readLine());
            if (B < 0 || H < 0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

