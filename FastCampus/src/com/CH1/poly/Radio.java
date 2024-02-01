package com.CH1.poly;

public class Radio extends Remocon{
    @Override
    public void Chup() {
        System.out.println("라디오 채널 업");
    }

    @Override
    public void Chdown() {
        System.out.println("라디오 채널 다운");
    }

    @Override
    public void volUp() {
        System.out.println("라디오 볼륨 업");
    }

    @Override
    public void volDown() {
        System.out.println("라디오 볼륨 다운");
    }
}
