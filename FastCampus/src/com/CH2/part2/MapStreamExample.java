package com.CH2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        //정수 리스트에서 각 원소를 제곱한 값(리스트)을 출력
        List<Integer> list = Arrays.asList(1,2,3,4,5);//리스트로 변환
        List<Integer> listSQ=list.stream()
                .map(n->n*n)
                .collect(Collectors.toList());
        System.out.println(listSQ);
        System.out.println("--------------------------------");
        //스트림의 문자여 원소를 대문자로 변환한 리스트 출력
        List<String> list1=Arrays.asList("ba","st","ss","qw","tg","po");
        List<String> listSTRING=list1.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(listSTRING);
    }
}
