package com.CH2.model;
//OracleDriver는 Oracle 회사에서 제공을 해줌(Driver)
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String Username, String Password) {
        System.out.println("Oracle implement Driver with url, Usernaame, Password");
    }
}
