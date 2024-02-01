package com.CH1.part3;

import com.CH1.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        //MovieVO 객체를 만들고 데이터를 저장 후 출력하기
        MovieVO vo=new MovieVO("아바타", "제이크 설리", "액션", 20221214,12, 192.0f);
        System.out.println(vo.toString());//toSring 생략 가능
    }
}
