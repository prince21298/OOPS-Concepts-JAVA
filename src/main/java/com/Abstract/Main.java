package com.Abstract;

public abstract class Main {
    int Age;

    public Main(int age) {
        Age = age;
    }

    static void getCall() {
        System.out.println("Hey Greetings!!!");
    }

    void normalModifier(int Number1) {
        System.out.println("This is normalModifier" + " " + Number1);
    }

    abstract void Carrer(String name);

    abstract void Passion(String name);

    abstract void Profession(String name);
}
