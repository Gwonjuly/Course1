package com.CH2.part2;

import com.CH2.model.MathOperation;

public class FunctionInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation mo=new FunctionInterfaceTest();
        int result=mo.operation(10,20);
        System.out.println(result);
    }

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
