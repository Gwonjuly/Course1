package com.CH2.model;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY=5;
    private Object[] obArr;
    private int size=0;

    public ObjectArray()
    {
        obArr=new Object[DEFAULT_CAPACITY];
    }
    public ObjectArray(int capa){
        obArr=new Object[capa];
    }
    public int size()
    {
        return size;
    }
    public Object get(int index)
    {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("range out");
        return obArr[index];
    }
    public void add(Object num){
        if(size== obArr.length){
            ensureCapacity();}
        obArr[size++]=num;
    }
    private void ensureCapacity(){
        int newCapacity= size*2;
        obArr= Arrays.copyOf(obArr,newCapacity);
    }

}
