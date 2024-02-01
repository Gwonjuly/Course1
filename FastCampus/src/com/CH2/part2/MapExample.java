package com.CH2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> stdScore=new HashMap<>();
        stdScore.put("Kim",95);
        stdScore.put("Lee",85);
        stdScore.put("Park",90);
        stdScore.put("Gwon",100);
        System.out.println("Gwon's Score:" +stdScore.get("Gwon"));
        System.out.println("Kim's Score:"+stdScore.get("Kim"));
        System.out.println("-------------------------------------");
        stdScore.put("Kim",0);
        System.out.println("Kim's new Score:" +stdScore.get("Kim"));
        System.out.println("-------------------------------------");
        stdScore.remove("Park");
        System.out.println("What about remove Park?:" +stdScore.get("Park"));
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> entry : stdScore.entrySet()){
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }
    }
}
