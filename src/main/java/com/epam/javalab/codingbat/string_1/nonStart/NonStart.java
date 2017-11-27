package com.epam.javalab.codingbat.string_1.nonStart;

public class NonStart {
    /**
     * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at
     * least length 1.

     nonStart("Hello", "There") → "ellohere"
     nonStart("java", "code") → "avaode"
     nonStart("shotl", "java") → "hotlava"
     */

    public static void main(String[] args) {}

    public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
    }
}
