package com.CH2.model;

public class MySqlDriver implements Connection{
    @Override
    public void getConnection(String url, String Username, String Password) {
        System.out.println("MYSQL implements driver with ~");
    }
}
