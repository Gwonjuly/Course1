package com.CH2.part2;

import com.CH2.model.MathOperation;

public class FunctionInterfaceTest1 {
    //MathOperation 인터페이스를 내부 익명클래스로 구현
    //MathOperation mo=new MathOperation(); 인터페이스(추상 클래스도 동일)는 단돆으로 객체를 생성할 수 없음
    public static void main(String[] args) {
        MathOperation mo=new MathOperation() {//인터페이스는 존재하지만 구현 클래스는 존재하지 않음: 익명 내부 클래스
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result=mo.operation(10,20);
        System.out.println(result);
    }
}
