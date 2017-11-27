package com.epam.javalab.codingbat.string_1.atFirst;

public class AtFirst {
    /**
     * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2,
     * use '@' for the missing chars.

     atFirst("hello") → "he"
     atFirst("hi") → "hi"
     atFirst("h") → "h@"
     */

    public static void main(String[] args) {}

    public String atFirst(String str) {
        if(str.length() >=2) return str.substring(0,2);
        else if (str.length() == 1) return str + "@";
        else return "@@";
    }
}
