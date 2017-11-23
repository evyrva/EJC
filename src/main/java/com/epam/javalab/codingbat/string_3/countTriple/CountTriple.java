package com.epam.javalab.codingbat.string_3.countTriple;

public class CountTriple {
    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.

     countTriple("abcXXXabc") → 1
     countTriple("xxxabyyyycd") → 3
     countTriple("a") → 0
     */
    public static void main(String[] args){
        System.out.println(countTriple("xxxabyyyycd"));
    }

    public static int countTriple(String str) {
        char[] chars = str.toCharArray();
        int n = 0;
        for (int i = 1; i < str.length()-1; i++) {
            if (chars[i-1] == chars[i] && chars[i+1] == chars[i]) n++;
        }
        return n;
    }

}
