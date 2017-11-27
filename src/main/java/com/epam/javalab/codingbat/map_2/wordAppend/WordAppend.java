package com.epam.javalab.codingbat.map_2.wordAppend;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    /**
     * Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th,
     * 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a
     * 2nd time.

     wordAppend(["a", "b", "a"]) → "a"
     wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
     wordAppend(["a", "", "a"]) → "a"
     */

    public static void main(String[] args){

    }


    public String wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strings){
            map.merge(s, 1, (value, newValue) -> value+1);
            if (map.get(s) % 2 == 0){
                stringBuilder.append(s);
            }
        }
        return stringBuilder.toString();
    }
}
