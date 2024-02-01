package com.CH2.model;
//정적 메서드 참조: 클래스명::정적메서드 명
public class IntegerUtils {
    public static int stringToInt(String s){//정적 메서드 참조이기에 static 선언, 사용 시 클래스 객체를 생성할 필요 없음
        return Integer.parseInt(s);//문자열 -> 정수 변환
    }
}
