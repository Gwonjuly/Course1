package com.CH1.model;

public class Dog extends Animal{
    public Dog(){
        super();//new Animal, 기본 생락
    }
    public void eat(){
        System.out.println("개처럼 먹다.");
    }
}
