package com.CH1.part3;

import com.CH1.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo=new PersonVO("이금희", 49,"010-6373-8829");//생성자 오버로딩
        //System.out.println(vo.getName() +"\t" + vo.getAge() +"\t" + vo.getPhone());
        System.out.println(vo.toString());
        System.out.println(vo);//=vo.toString(), 객체 vo가 가진 값들을 모두 의미 즈, 컴파일러가 vo.toString()을 찾음
    }
}
