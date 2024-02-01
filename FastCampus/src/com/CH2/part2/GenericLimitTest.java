package com.CH2.part2;

import com.CH2.model.Average;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5};
        Double[] doubles={1.0, 2.0,3.0,4.0,5.0};
        Average<Integer> integerAverage=new Average<>(integers);
        double result1=integerAverage.calAverage();
        System.out.println("int result1:" +result1);

        Average<Double> doubleAverage=new Average<>(doubles);
        double result2=doubleAverage.calAverage();
        System.out.println("double result2:" +result2);
    }
}
