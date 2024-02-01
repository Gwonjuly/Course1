package com.CH1.part4;

import com.CH1.model.*;//Animal -> *

public class OverrideTest {
    public static void main(String[] args) {
        Animal ani;
        ani=new Dog();
        ani.eat();

        ani=new Cat();//Dog이랑 부모가 같은 ani이기에 이름을 달리할 필요 없음
        ani.eat();
    }
}
