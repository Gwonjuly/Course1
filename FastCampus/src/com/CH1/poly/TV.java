package com.CH1.poly;

public class TV extends Remocon{
    @Override
    public void Chup() {
        System.out.println("티비 채널 업");
    }

    @Override
    public void Chdown() {
        System.out.println("티비 채널 다운");
    }

    @Override
    public void volUp() {
        System.out.println("티비 볼륨 업");
    }

    @Override
    public void volDown() {
        System.out.println("티비 볼륨 다운");
    }
}
