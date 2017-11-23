package com.epam.javalab.codingbat.string_3.equalIsNot;

public class EqualIsNot {
    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

     equalIsNot("This is not") → false
     equalIsNot("This is notnot") → true
     equalIsNot("noisxxnotyynotxisi") → true
     */

    public static void main(String[] args){
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }

    public static boolean equalIsNot(String str) {
        int countIs = 0, countNot = 0;
        while(str.matches("(^|.+)(is|IS)($|.+)")){
            countIs++;
            str = str.replaceFirst("(is|IS)","");
        }
        while(str.matches("(^|.+)(not|NOT)($|.+)")){
            countNot++;
            str = str.replaceFirst("(not|NOT)","");
        }
        return countIs == countNot;
    }
}
