package com.borisovskiy.collectionsmaps.utils;

import java.util.Map;

public class FillingMap {

    public static void fillMap(Map<Integer, Integer> maps, int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            maps.put(i, i);
        }
    }
}