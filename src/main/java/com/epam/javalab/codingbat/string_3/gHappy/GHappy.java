package com.epam.javalab.codingbat.string_3.gHappy;

public class GHappy {
    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.

     gHappy("xxggxx") → true
     gHappy("xxgxx") → false
     gHappy("xxggyygxx") → false
     */

    public static void main(String[] args){
        System.out.println(gHappy("xxggyygxx"));
    }

    public static boolean gHappy(String str) {
        if (str.equals("g")) return false;
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i) == 'g'){
                if (str.charAt(i+1) == 'g' || str.charAt(i-1) == 'g'){
                } else return false;
            }
        }
        if (str.endsWith("g") && !str.endsWith("gg")) return false;
        return true;
    }
}
