package com.CH2.part2;

import com.CH2.model.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list =new ArrayList<>();//movie[], 제네릭 안쓰면 object 배열이기에 업캐스팅, 다운 캐스팅 필요함
        list.add(new Movie("괴물","봉준호","2006년","한국"));
        list.add(new Movie("기생충","봉준호","2019년","한국"));
        list.add(new Movie("완벽한 타인","이재규","2006년","한국"));
        for(Movie str: list)
            System.out.println(str);//.toString() 생략되어 있음
        System.out.println("+----------------+--------+----+------+");
        System.out.println("|영화제목          |감독     |개봉년도|국가 |");
        System.out.println("+----------------+--------+----+------+");
        for(Movie m:list){
            System.out.printf("|%-16s|%-8s|%4s|%-6s|\n",m.getTitle(),m.getDirector(),m.getYear(),m.getCountry());
            System.out.printf("+----------------+--------+----+------+\n");
        }
        String searchTitle="기생충";
        for(Movie m:list){
            if(m.getTitle().equals(searchTitle)){
                System.out.println(m);
                System.out.println("영화제목:" +m.getTitle());
                System.out.println("영화감독:" +m.getDirector());
                System.out.println("개봉년도:" +m.getYear());
                System.out.println("개봉국가:" +m.getCountry());
                break;
            }
        }
    }
}
