package com.CH1.part4;

public class EmployeeInitTest {
    public static void main(String[] args) {
        RempVO vo=new RempVO("권주리", 26, "010-9372-6068","2024-01-01","sw1팀",false);//이게 정보은닉에 위반이라네..
        System.out.println(vo.toString());
    }
}
