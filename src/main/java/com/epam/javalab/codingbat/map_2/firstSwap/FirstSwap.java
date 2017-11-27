package com.epam.javalab.codingbat.map_2.firstSwap;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    /**
     * We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then
     * return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap
     * the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its
     * later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult
     * than it looks.

     firstSwap(["ab", "ac"]) → ["ac", "ab"]
     firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
     firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
     */

    public static void main(String[] args){

    }

    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> mapPlace = new HashMap<>();
        Map<Character, Integer> mapCount = new HashMap<>();
        String buffer;
        for (int i = 0; i < strings.length; i++) {
            if (mapPlace.containsKey(strings[i].charAt(0)) && mapCount.get(strings[i].charAt(0)) < 2){
                buffer = strings[mapPlace.get(strings[i].charAt(0))];
                strings[mapPlace.get(strings[i].charAt(0))] = strings[i];
                strings[i] = buffer;
                mapCount.put(strings[i].charAt(0), mapCount.get(strings[i].charAt(0))+1);
            } else if(!mapPlace.containsKey(strings[i].charAt(0))) {
                mapPlace.put(strings[i].charAt(0), i);
                mapCount.put(strings[i].charAt(0), 1);
            }
        }
        return strings;
    }
}
