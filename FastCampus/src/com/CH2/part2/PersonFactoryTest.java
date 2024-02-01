package com.CH2.part2;

import com.CH2.model.Person;
import com.CH2.model.PersonFactory;

/*
생성자 메서드 참조
클래스 Persoon의 생성자(new)를 참조한다.
 */
public class PersonFactoryTest {
    public static void main(String[] args) {
        PersonFactory personFactory= Person::new;
        Person person=personFactory.create("july",26);
        System.out.println(person);

        PersonFactory anonyperson=new PersonFactory() {//익명 내부 클래스
            @Override
            public Person create(String name, int age) {
                return new Person(name,age);
            }
        };
        Person person1=anonyperson.create("권민주",24);
        System.out.println(person1);
    }
}
