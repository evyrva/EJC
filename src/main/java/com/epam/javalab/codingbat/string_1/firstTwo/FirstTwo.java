package com.epam.javalab.codingbat.string_1.firstTwo;

public class FirstTwo {
    /**
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
     * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty
     * string "" yields the empty string "". Note that str.length() returns the length of a string.

     firstTwo("Hello") → "He"
     firstTwo("abcdefg") → "ab"
     firstTwo("ab") → "ab"
     */
    public static void main(String[] args) {}

    public String firstTwo(String str) {
        return str.substring(0, str.length() < 2 ? str.length(): 2);
    }
}
