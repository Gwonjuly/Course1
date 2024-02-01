package com.CH1.part3;

import com.CH1.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
       PersonVO vo=new PersonVO();//기본 생성자
       PersonVO vo1=new PersonVO("권민주",24,"010-4071-6068");//생성자 오버로딩
        System.out.println(vo.getName() + "\t" + vo.getAge() +"\t" + vo.getPhone());
        System.out.println(vo1.getName() + "\t" + vo1.getAge() +"\t" + vo1.getPhone());
    }
}
