package com.CH2.part2;

import com.CH2.model.Converter;
import com.CH2.model.StringUtils;
/*
인스턴스(클래스) 메서드 참조
=객체 명::메서드 명
String -> reverse한 String
여기서 converter는 객체 stringUtils의 메서드 reverse를 참조한다.
 */
public class StringUtillsTest {
    public static void main(String[] args) {
        StringUtils stringUtils=new StringUtils();//정적 메서드 참조가 아니기에 객체를 생성해야 함
        Converter<String,String> converter=stringUtils::reverse;//인스턴스 메서드 참조
        String result=converter.convert("Gwon Ju Ly");
        System.out.println(result);
    }
}
