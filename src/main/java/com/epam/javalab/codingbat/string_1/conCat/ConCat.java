package com.epam.javalab.codingbat.string_1.conCat;

public class ConCat {
    /**
     * Given two strings, append them together (known as "concatenation") and return the result. However,
     * if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields
     * "abcat".

     conCat("abc", "cat") → "abcat"
     conCat("dog", "cat") → "dogcat"
     conCat("abc", "") → "abc"
     */
    public static void main(String[] args) {}

    public String conCat(String a, String b) {
        if (a.equals("") || b.equals("")) return a+b;
        return a.charAt(a.length()-1) == b.charAt(0) ? a.substring(0,a.length()-1) + b : a+b;
    }
}
