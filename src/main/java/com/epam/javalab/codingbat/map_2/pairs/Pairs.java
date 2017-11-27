package com.epam.javalab.codingbat.map_2.pairs;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    /**
     * Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add
     * its first character as a key with its last character as the value.

     pairs(["code", "bug"]) → {"b": "g", "c": "e"}
     pairs(["man", "moon", "main"]) → {"m": "n"}
     pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
     */

    public static void main(String[] args){

    }


    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings){
            map.put(s.charAt(0)+"", s.charAt(s.length()-1)+"");
        }
        return map;
    }
}