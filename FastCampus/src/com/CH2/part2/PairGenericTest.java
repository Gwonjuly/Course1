package com.CH2.part2;

import com.CH2.model.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair=new Pair<>("Hello", 100);
        System.out.println("key: " + pair.getKey());
        System.out.println("value: " + pair.getValue());

        Map<String,Integer> map=new HashMap<>();
        map.put("K",90);
        map.put("S",10);
        System.out.println(map.get("K"));
    }
}
