package com.epam.javalab.hackerrank.advanced.javaMD5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader( new InputStreamReader(System.in))){
            for (byte b : getHash(reader.readLine())) System.out.printf("%02x", b);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static byte[] getHash(String text){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(text.getBytes());
            return md.digest();
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return null;
    }
}
