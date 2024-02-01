package com.CH1.part4;

import com.CH1.poly.*;

public class AbstractClassTest {
    public static void main(String[] args) {
        //추상 클래스는 단독으로 객체를 생성할 수 없다.
        Animal ani=new Dog();
        ani.eat();
        ani.move();
        ani=new Cat();
        ani.eat();
        ((Cat)ani).light();
    }
}
