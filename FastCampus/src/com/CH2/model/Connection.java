package com.CH2.model;
//interface는 자바에서 제공
public interface Connection {
    //데이터 베이스 연결 동작
    public void getConnection(String url, String Username, String Password);
}
