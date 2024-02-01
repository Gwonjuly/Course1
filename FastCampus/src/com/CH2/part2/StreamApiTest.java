package com.CH2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamApiTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //기존 방식
        int even = 0;
        for (int i : numbers) {
            if (i % 2 == 0)
                even += i;
        }
        System.out.println(even);
        System.out.println("-----------------------------");

    //IntStream stream=Arrays.stream(numbers);
    int sum=Arrays.stream(numbers)
            .filter(n->n%2==0)//n: stream의 원소 하나, 즉 람다식임
            .sum();

    System.out.println(sum);
        System.out.println("-----------------------------");
        int[] arr=Arrays.stream(numbers)
                .filter(n->n%2==0)
                .toArray();
        for(int i:arr)
            System.out.println(i);

    }
}
