package com.CH2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple");//set은 중복 x
        System.out.println(set.size());
        for(String s:set)
            System.out.println(s);
        set.remove("banana");
        System.out.println("------------------");
        for (String s:set)
            System.out.println(s);
        System.out.println("------------------");
        boolean checkContains=set.contains("cherry");
        System.out.println("Set contains Cherry?" +checkContains);
        System.out.println("------------------");
        set.clear();
        boolean checkEmpty= set.isEmpty();
        System.out.println("Is it empty?" + checkEmpty);
    }
}
