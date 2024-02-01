package com.CH2.part2;

import com.CH2.model.MathOperation;

public class LamdaExample {
    public static void main(String[] args) {
        //익명 내부 클래스
        MathOperation mathOperation=new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int internalclass=mathOperation.operation(10,20);
        System.out.println(internalclass);

        //익명 내부 클래스를 람다식으로 표현
        MathOperation add=(x,y) ->{return x+y;};
        MathOperation add2=(i,j) ->i-j;
        System.out.println("plus:" + add.operation(10,20));
        System.out.println("minus:" +add2.operation(10,20));
    }
}
