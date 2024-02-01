package com.CH1.part3;

import com.CH1.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO vo=new PersonVO(); //객체 생성과 동시에 초기화를  진행하기 때문에 set을 안해도 값이 출력됨
        System.out.println(vo.getName() + "\t" + vo.getAge() +"\t" + vo.getPhone());
        PersonVO vo1=new PersonVO(); //객체 생성과 동시에 초기화를  진행하기 때문에 set을 안해도 값이 출력됨
        System.out.println(vo1.getName() + "\t" + vo1.getAge() +"\t" + vo1.getPhone());
    }
}
