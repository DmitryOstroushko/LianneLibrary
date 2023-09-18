package com.lianne.lianne.map;

import java.util.HashMap;

public class MapTools {


    public static void counterStringKey(String key, HashMap<String, Integer> listCount) {
        Integer frequency = listCount.get(key);
        listCount.put(key, frequency == null ? 1 : frequency + 1);
    }


    public static void counterIntegerKey(Integer key, HashMap<Integer, Integer> listCount) {
        Integer frequency = listCount.get(key);
        listCount.put(key, frequency == null ? 1 : frequency + 1);
    }

}
