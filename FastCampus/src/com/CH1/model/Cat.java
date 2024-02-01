package com.CH1.model;

public class Cat extends Animal{
    public Cat(){
        super();//new Animal, 기본 생략
    }
    public void eat(){
        System.out.println("고양이처럼 먹다");
    }
    public void light(){
        System.out.println("빛난다.");
    }
}

