package com.CH2.part2;

public class WapperTest {
    public static void main(String[] args) {
        int a=10;// 기본 자료형
        Integer intManual= new Integer(a);//사용자 정의 자료형: boxing
        Integer intAuto=a; //auto_boxing
        System.out.println(intAuto.intValue());//Integer -> int: unboxing
        System.out.println(intAuto);
        System.out.println(intManual);
        int i=intAuto.intValue();
        System.out.println(i);

        Float ffAuto=14.5f;
        System.out.println(ffAuto);//auto_unboxing
        float ffManual=ffAuto.floatValue();//unboxing
        System.out.println(ffAuto+ffManual);
    }
}
