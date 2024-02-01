package com.CH2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("apple");//"apple"=new String("apple")
        list.add("banana");
        list.add("lemon");
        list.add("cherry");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("size of list:" + list.size());
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        list.set(0,"apple2");
        System.out.println(list.get(0));
        for(String str: list){
            System.out.println(str);
        }
    }
}
