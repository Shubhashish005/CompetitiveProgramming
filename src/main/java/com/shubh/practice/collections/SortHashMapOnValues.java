package com.shubh.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapOnValues {

    private static Map<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {

        hashMap.put("Raj", 3);
        hashMap.put("Akash", 2);
        hashMap.put("Nizam", 1);
        hashMap.put("Swarn", 4);

        List<Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue());
        System.out.println(hashMap);
        Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue());
        System.out.println(hashMap);
    }
}
