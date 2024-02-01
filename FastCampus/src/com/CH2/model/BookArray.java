package com.CH2.model;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY=5;
    private Book[] books;//Book -> Object로 하면 범용적인  API가 가능한다.
    private int size=0;

    public BookArray(){
        books=new Book[DEFAULT_CAPACITY];
    }
    public int size(){
        return size;
    }
    public void add(Book num){
        if(size== books.length){
            ensureCapacity();
        }
        books[size++]=num;
    }
    private void ensureCapacity(){
        int newCapacity= books.length*2;
        books= Arrays.copyOf(books,newCapacity);
    }
    public Book get(int index){
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("range out");
        return books[index];
    }
}
