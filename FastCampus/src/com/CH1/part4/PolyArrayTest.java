package com.CH1.part4;

import com.CH1.model.*;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        Animal[] ani= new Animal[2];//다형서 배열
        ani[0]=d;
        ani[1]=c;
        display(ani);
    }
    private static void display(Animal[] ani){
        for(int i=0;i< ani.length;i++) {
            ani[i].eat();
            if(ani[i] instanceof Cat)
                ((Cat)ani[i]).light();
        }
    }
}
