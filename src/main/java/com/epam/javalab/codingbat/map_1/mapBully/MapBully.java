package com.epam.javalab.codingbat.map_1.mapBully;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapBully {
    /**
     * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and
     * set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty
     * string.

     mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
     mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
     mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */

    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        System.out.println(mapBully(map).toString());
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a") && map.get("a") != null){
            map.merge("b",map.get("a"),(value, newValue) -> newValue = map.get("a"));
            map.put("a", "");
        }
        return map;
    }

}
