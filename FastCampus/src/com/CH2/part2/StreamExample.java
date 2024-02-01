package com.CH2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
스트림 API와 함수형 인터페이스를 사용하여 List에 저장된 정수들의 짝수 여부를 판단하고, 짝수들만 필터링하여 정렬한다
그리고 각 숫자를 제곱ㅎ나 후 모든 숫자의 합을 구하여 출력
 */
public class StreamExample {
    public static boolean isEven2(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven=n->n%2==0;

        int result=numbers.stream()
                //.filter(n->n%2==0)//n->n%2==0
                .filter(isEven)//위와 동일, 아래와 동일
                //.filter(StreamExample::isEven2) 정적 메서드 참조 방식
                .sorted()//오름차순
                .map(n->n*n)//스트림의 모든 원소에 대해 제곱
                .reduce(0,Integer::sum);//스트림의 모든 원소를 결합, 특정 객체의 인스턴스 메서드  참조
        System.out.println(result);
    }
}
