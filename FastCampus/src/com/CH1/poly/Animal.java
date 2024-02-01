package com.CH1.poly;

public abstract class Animal {

    public abstract void eat();//추상메서드
    public void move(){//구현된 메서드
        System.out.println("동물은 무리지어 다닌다");
    }
}
