package com.CH2.part2;

import com.CH2.model.StringOperation;

public class LamdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase=s-> s.toUpperCase();//모든 String을 대문자로
        StringOperation toLowerCase=s->s.toLowerCase();
        String input="Lamda Expressions";

        //processString 메서드에 람다 표현식을 인자로 전달하여 결과를 출력
        System.out.println("Uppler: " +processString(input,toUpperCase));
        System.out.println("Lower: "+processString(input,toLowerCase));
    }
    //람다 표현식을 인자로 사용하는 메서드를 작성
    private static String processString(String input, StringOperation operation) {
       return operation.apply(input);
    }

}
