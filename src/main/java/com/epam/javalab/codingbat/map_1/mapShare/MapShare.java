package com.epam.javalab.codingbat.map_1.mapShare;

import java.util.HashMap;
import java.util.Map;

public class MapShare {
    /**
     *Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
     * In all cases remove the key "c", leaving the rest of the map unchanged.

     mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
     mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
     mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */

    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy1");
        map.put("b", "dirt");
        map.put("c", "ccc");
        System.out.println(mapShare(map).toString());
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a") && map.get("a") != null){
            map.merge("b",map.get("a"),(value, newValue) -> newValue = map.get("a"));
//            map.put("a", "");
        }
        map.remove("c");
        return map;
    }
}
