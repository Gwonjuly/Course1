package com.CH2.model;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY=5;//수정 불가
    private int[] arr;
    private int size=0;

    public IntArray(){
        arr=new int[DEFAULT_CAPACITY];
    }
    public void add(int num){
        if(size== arr.length){
            ensureCapacity();
        }
        arr[size++]=num;
    }
    public int size(){
        return size;
    }
    public int get(int index){
        if(index<0 || index>=size)
            throw new IndexOutOfBoundsException("index 범위 초과");
        return arr[index];
    }

    private void ensureCapacity(){
        int newCapacity= arr.length*2;
        arr= Arrays.copyOf(arr,newCapacity);
    }

}
