package com.CH2.part1;

import com.CH2.model.*;

public class MyIntArrayTest {
    public static void main(String[] args) {
        IntArray list=new IntArray();
        System.out.println("arr 초기 사이즈: " + list.size());
        for(int i=1;i<11;i++)
            list.add(i);
        System.out.println("add 후 arr 사이즈: "+list.size());
        //list.get(11);
        for(int i=0;i< list.size();i++)
            System.out.println("Index"+i+": "+list.get(i));

        System.out.println("------------------Book------------------");
        BookArray list2=new BookArray();
        list2.add(new Book("java", 1000, "A_Com","author1"));
        list2.add(new Book("Python", 1000, "A_Com","author1"));
        list2.add(new Book("C++", 1000, "A_Com","author1"));
        list2.add(new Book("JSP", 1000, "A_Com","author1"));
        System.out.println(list2.size());
        for(int i=0;i< list2.size();i++){
            System.out.println(list2.get(i));
            /*Book book_err= list2.get(i);
            System.out.println(book_err);*/
        }
        for(int i=0;i< list2.size();i++){
            Book vo= list2.get(i);
            System.out.println(vo.toString());
        }
        System.out.println("------------------Object------------------");
        ObjectArray list3=new ObjectArray();
        //객체 A,B,C 만들기
        list3.add(new A());
        list3.add(new B());
        list3.add(new C());
        list3.add(new A());
        list3.add(new B());
        list3.add(new C());
        //다운 캐스팅
        A a=(A)list3.get(0); //Object -> A, list3.get()이 a 객체
        a.display();
        B b=(B)list3.get(1);
        b.display();;
        C c=(C)list3.get(2);
        c.display();;
        for(int i=0;i< list3.size();i++){
            if(list3.get(i) instanceof A)
                ((A)list3.get(i)).display();
            else if(list3.get(i) instanceof B)
                ((B)list3.get(i)).display();
            else
                ((C)list3.get(i)).display();
        }
    }
}
