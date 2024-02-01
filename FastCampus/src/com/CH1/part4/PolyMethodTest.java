package com.CH1.part4;

import com.CH1.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d=new Dog();
        display(d);
        Cat c=new Cat();
        display(c);
    }
    //아래 방법은 타입이 늘어나면 메서드가 추가되야 함
    /*private static void display(Dog d) {//private로 설정해도 같은 클래스내에서 호출하기에 괜찮음
        d.eat();
    }
    private static void display(Cat c){//같은 메서드 명으로 다른 인자를 받음: 오버로딩(정적 바인딩)
        c.eat();
    }*/
    private static void display(Animal ani){
        ani.eat();
        /*Cat x=(Cat) ani;
        x.light(); ->*/
       // ((Cat)ani).light();//인자가 Dog d일 경우 오류 발생, 즉 Cat 타입일 때만 실행되어야 함
        if(ani instanceof Cat){
            ((Cat)ani).light();
        }
        /*
        instancof:
        타입 확인 연산자로 true or false를 반환함
         */
    }
}
