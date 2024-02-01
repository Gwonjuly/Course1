package com.CH2.model;

public class MsSqlDriver implements Connection{
    @Override
    public void getConnection(String url, String Username, String Password) {
        System.out.println("MSSQL implement Driver with ~~");
    }
}
