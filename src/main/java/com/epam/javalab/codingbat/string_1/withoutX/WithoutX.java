package com.epam.javalab.codingbat.string_1.withoutX;

public class WithoutX {
    /**
     * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and
     * otherwise return the string unchanged.

     withoutX("xHix") → "Hi"
     withoutX("xHi") → "Hi"
     withoutX("Hxix") → "Hxi"
     */

    public static void main(String[] args) {}

    public String withoutX(String str) {
        if (str.length()<2) return "";
        return (str.startsWith("x") ? str.substring(1,str.length()-1) : str.substring(0,str.length()-1))
                + (str.endsWith("x") ? "" : str.substring(str.length()-1));
    }
}
