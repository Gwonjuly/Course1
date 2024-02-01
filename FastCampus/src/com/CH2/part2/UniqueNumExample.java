package com.CH2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumExample {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,2,4,6,7,1,3};
        Set<Integer> uniquenum=new HashSet<>();
        for(int i:num)
            uniquenum.add(i);
        System.out.println("UniqueNum-------------");
        for (int i:uniquenum)
            System.out.println(i);
    }
}
