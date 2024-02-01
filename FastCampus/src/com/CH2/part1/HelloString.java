package com.CH2.part1;

public class HelloString {
    public static void main(String[] args) {
        String str=new String("hello");//heap memory
        System.out.println(str);//totring 생략 가능
        System.out.println(str.toString());

        String str1="이건 리터럴";
        System.out.println(str1);
        System.out.println(str1.toString());
    }
}
