package com.epam.javalab.codingbat.string_1.extraEnd;

public class ExtraEnd {
    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
     * The string length will be at least 2.

     extraEnd("Hello") → "lololo"
     extraEnd("ab") → "ababab"
     extraEnd("Hi") → "HiHiHi"
     */

    public static void main(String[] args) {}

    public String extraEnd(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.substring(str.length()-2));
        for (int i = 0; i < 2; i++) {
            stringBuilder.append(str.substring(str.length()-2));
        }
        return stringBuilder.toString();
    }

}
