package com.shubh.practice.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapValues {

    public static void main(String[] args) {

        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "A");
        hmap.put(2, "B");
        hmap.put(3, "C");
        hmap.put(3, "D");


        System.out.println(hmap);

        Map<Integer, String> hashTable = new Hashtable<>();
    }
}
