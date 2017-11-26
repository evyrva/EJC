package com.epam.javalab.codingbat.map_2.wordCount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    /**
     * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
     * different string, with the value the number of times that string appears in the array.

     wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
     wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */

    public static void main(String[] args){

    }


    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings){
            map.merge(s, 1, (value, newValue) -> value+1);
        }
        return map;
    }
}
