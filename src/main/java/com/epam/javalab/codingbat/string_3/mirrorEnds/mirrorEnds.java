package com.epam.javalab.codingbat.string_3.mirrorEnds;

public class mirrorEnds {
    /**
     * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
     * In other words, zero or more characters at the very begining of the given string, and at the very end of the
     * string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

     mirrorEnds("abXYZba") → "ab"
     mirrorEnds("abca") → "a"
     mirrorEnds("aba") → "aba"
     */

    public static void main(String[] args){
        System.out.println(mirrorEnds("abXYZba"));
    }

    public static String mirrorEnds(String string) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length()-1-i))
                stringBuilder.append(string.charAt(i));
            else break;
        }
        return stringBuilder.toString();
    }

}
