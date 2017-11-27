package com.epam.javalab.codingbat.string_1.withoutX2;

public class WithoutX2 {
    /**
     * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
     * and otherwise return the string unchanged. This is a little harder than it looks.

     withoutX2("xHi") → "Hi"
     withoutX2("Hxi") → "Hi"
     withoutX2("Hi") → "Hi"
     */
    public static void main(String[] args) {}

    public String withoutX2(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < 2 && str.charAt(i) == 'x') {}
            else stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

}
