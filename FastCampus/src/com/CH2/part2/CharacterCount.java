package com.CH2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str="Hello, World!";
        Map<Character, Integer> countMap=new HashMap<>();
        char[] strArr=str.toCharArray();//문자열을 분리해서 문자배열을 생성함 {'H','e','l'..}

        for(char c: strArr){
            if(countMap.containsKey(c))
                countMap.put(c,(countMap.get(c)+1));
            else
                countMap.put(c,1);
        }
        System.out.println("Count");
        for (char c: countMap.keySet()){
            System.out.println(c+":"+countMap.get(c));
        }
        System.out.println("Count2");
        for (Map.Entry<Character,Integer> entry: countMap.entrySet()){
            System.out.println(entry.getKey() +":"+entry.getValue());
        }
    }
}
