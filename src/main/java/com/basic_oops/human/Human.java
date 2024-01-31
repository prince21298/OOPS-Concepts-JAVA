package com.basic_oops.human;

public class Human {
    String name;
    int age;
    Boolean married;
    static long population;

    public Human(String name, int age, Boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
        Human.population += 1;
    }

    public static void main(String[] args) {
        
    }
}
