package com.CH2.model;

public class Average <T extends Number>{
    private T[] numbers;
    public Average(){}

    public Average(T[] numbers) {
        this.numbers = numbers;
    }

    public double calAverage(){
        double sum=0.0;
        for (T number: numbers){
            sum+=number.doubleValue();//doubleValue(): double로 형 변환
        }
        return sum/numbers.length;//배열의 길이
    }
}
