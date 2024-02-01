package com.CH2.part3;

import com.CH2.model3.Member;
import com.google.gson.Gson;

public class GsonInteractJson {
    public static void main(String[] args) {
        System.out.println("--------------GsonToJson------------------");
        Member mvo=new Member("권주리",26,"wnfl0925@naver.com");
        Gson gson=new Gson();//외부 API도 객체 생성
        String json=gson.toJson(mvo);
        System.out.println("String1: " +mvo.toString());
        System.out.println("json1: "+json);
        System.out.println("--------------GsonFromJson------------------");
        Member mvo2=gson.fromJson(json,Member.class);//(JSON 포맷, 바꿀 객체 클래스)
        System.out.println(mvo2);

    }
}
