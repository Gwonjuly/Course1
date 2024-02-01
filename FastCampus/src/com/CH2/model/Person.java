package com.CH2.model;

public class Person {
    private String name;
    private int age;

    public Person(){}//일반적으로 기본 생성자도 만들어 놓는 것이 좋음
    public Person(String name, int age) {//생성자
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
