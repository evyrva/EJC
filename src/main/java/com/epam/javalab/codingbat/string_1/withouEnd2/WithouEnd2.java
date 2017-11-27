package com.epam.javalab.codingbat.string_1.withouEnd2;

public class WithouEnd2 {
    /**
     * Given a string, return a version without both the first and last char of the string. The string may be
     * any length, including 0.

     withouEnd2("Hello") → "ell"
     withouEnd2("abc") → "b"
     withouEnd2("ab") → ""
     */

    public static void main(String[] args) {}

    public String withouEnd2(String str) {
        if (str.length() < 3) return "";
        else return str.substring(1,str.length()-1);
    }
}
