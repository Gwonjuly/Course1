package com.CH1.part4;

import com.CH1.model.*;

public class ObjectCasting {
    public static void main(String[] args) {
        //업캐스킹 Animal -> Dog/Cat, 즉 자식을 부모로 형 변한
        Animal ani=new Dog();
        ani.eat();//재정의(동적 바인딩)
        ani=new Cat();
        ani.eat();
        //ani.light(); 에러 발생, light는 부모한테는 없고 자식한테만 있는 고유 특성(메서드)임

        //다운 캐스팅: 부모를 자식형으로 형 변환
        Cat c=(Cat) ani;
        c.light();
        ((Cat)ani).light();//위 두 줄과 동일
        /*Overloading(오버로딩): 정적 바인딩(컴파일 시점에서 사용될 메서드가 결정되는 바인딩
         --> 프로그램의 실행되는 속도와 무관
         Override(재정의): 동적 바인딩(실행시점에서 사용되 메서드가 결정되는 바인딩)
         --> 프로그랭의 실행되는 속도와 관련이 있음
         */
    }
}
