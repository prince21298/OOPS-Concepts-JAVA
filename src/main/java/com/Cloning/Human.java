package com.Cloning;

public class Human implements Cloneable{
    int age;
    String name;

    int[] arr = {3,4,5,6,7,8,9,1};
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
