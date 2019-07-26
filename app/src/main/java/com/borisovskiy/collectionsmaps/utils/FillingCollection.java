package com.borisovskiy.collectionsmaps.utils;

import java.util.List;

public class FillingCollection {

    public static void fillCollection(List<Integer> list, int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
    }
}