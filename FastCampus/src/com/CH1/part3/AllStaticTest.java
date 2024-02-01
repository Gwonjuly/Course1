package com.CH1.part3;

import com.CH1.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
        //AllStatic st= new AllStatic();//생성자를 private로 만들면 생성 못함
        //System.out.println(st.hap(10,20));

        System.out.println(AllStatic.hap(10,20));//이게 더 바람직

        //System sys=new System();//System은 private 생성자이기에 객체 생성 못함
        //Math.max(30,60);
    }
}
