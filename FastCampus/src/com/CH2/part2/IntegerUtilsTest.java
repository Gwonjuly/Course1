package com.CH2.part2;

import com.CH2.model.Converter;
import com.CH2.model.IntegerUtils;
/*
정적 메서드 참조
=클래스명::정적 메서드 명
여기서 converter는 stringToInt를 참조한다(String -> Integer)
 */
public class IntegerUtilsTest {
    public static void main(String[] args) {
        Converter<String, Integer> converter= IntegerUtils::stringToInt;
        Integer result= converter.convert("123");//아래처럼 int로 해도 무방함
        System.out.println(result);
        int result1= converter.convert("456");//auto_unboxing
        System.out.println(result1);
    }
}
