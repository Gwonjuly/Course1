package com.CH2.model;
@FunctionalInterface
public interface PersonFactory {
    public Person create(String name, int age);
}
