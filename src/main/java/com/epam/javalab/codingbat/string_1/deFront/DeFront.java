package com.epam.javalab.codingbat.string_1.deFront;

public class DeFront {
    /**
     * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
     * and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

     deFront("Hello") → "llo"
     deFront("java") → "va"
     deFront("away") → "aay"
     */

    public static void main(String[] args) {}

    public String deFront(String str) {
        if (str.length() < 1) return "";
        if (str.length() == 1) return str.equals("a") ? "a" : "";
        return (str.charAt(0) == 'a' ? "a" : "") + (str.charAt(1) == 'b' ? "b" : "") + str.substring(2);
    }
}
