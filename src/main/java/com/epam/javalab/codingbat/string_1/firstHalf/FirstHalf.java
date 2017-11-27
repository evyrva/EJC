package com.epam.javalab.codingbat.string_1.firstHalf;

public class FirstHalf {
    /**
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

     firstHalf("WooHoo") → "Woo"
     firstHalf("HelloThere") → "Hello"
     firstHalf("abcdef") → "abc"
     */

    public static void main(String[] args) {}

    public String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }
}
