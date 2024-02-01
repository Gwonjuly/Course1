package com.CH2.model;
@FunctionalInterface
public interface Converter <F,T>{ //F->T로 변환
    T convert(F from);
}
