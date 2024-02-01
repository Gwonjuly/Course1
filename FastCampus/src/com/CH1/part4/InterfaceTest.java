package com.CH1.part4;

import com.CH1.poly.*;

public class InterfaceTest {
    public static void main(String[] args) {
        Remocon remo=new Radio();//업 캐스팅
        remo.Chup();
        remo.Chdown();
        remo.volUp();
        remo.volDown();
        remo.internet();//오동작

        remo=new TV();
        remo.Chup();
        remo.Chdown();
        remo.volUp();
        remo.volDown();
        remo.internet();//오동작x
    }
}
