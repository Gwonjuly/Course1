package com.CH2.part1;

import com.CH2.model.Book;

import java.util.ArrayList;
/*
java.util.*; 로하면 List로 사용해도 무방 List: 부모, ArrayList 자식
*/
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);//= List list=
        /*
        만약 배열에 Book 타입만 저장을 원할 경우
        List<Book> list=new ArrayList<Book>();
        중요! 이렇게 하면 Book으로 다운 캐스팅을 할 필요가 없다.
        */
        list.add(new Book("java", 1000, "A_Com","author1"));
        list.add(new Book("java", 1000, "A_Com","author2"));
        list.add(new Book("java", 1000, "A_Com","author3"));
        Book vo=(Book)list.get(0);
        System.out.println(vo.toString());
        vo=(Book)list.get(1);
        System.out.println(vo);;
        for(int i=0;i< list.size();i++){
            //Book vo=list.get(i); 개별로 호출할 땐 Book 생략 불가능
            System.out.println((Book)list.get(i));//(Book) 생략 가능, Object -> Book (JVM)에서 자동으로 Book의 toString()
            /*
            Object의 toString이 하위 클래스인 Book의 toString으로 재정의 되어 있어서 .toString()도 생략 가능, 오버로딩(동적 바인딩)
             */
        }

    }
}
