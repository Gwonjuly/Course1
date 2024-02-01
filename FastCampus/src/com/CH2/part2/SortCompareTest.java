package com.CH2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
특정 객체의 인스턴스  메서드 참조
특정 객체: String, 인스턴스 메서드: compareTo
 */
public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("권주리","권민주","이금희","권혁래");//Arrays.asList(): list로 변환해줌
        //String 클래스의 compareT 메서드 참조
        Collections.sort(names,String::compareTo);//Collection의 sort 사용
        System.out.println(names);//list 형식으로 출력[]
        for(String s:names)//개별 출력
            System.out.println(s);
    }
}
