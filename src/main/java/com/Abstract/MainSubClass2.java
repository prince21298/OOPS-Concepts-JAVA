package com.Abstract;

public class MainSubClass2 extends Main {


    @Override
    void normalModifier(int Number1) {
        super.normalModifier(Number1);
    }

    public MainSubClass2(int age) {
        super(age);
    }

    @Override
    void Carrer(String name) {
        System.out.println("MainSubClass2 Test1 in the Age of" + " " + Age + " " + name);
    }

    @Override
    void Passion(String name) {
        System.out.println("MainSubClass2 Test1 in the Age of" + " " + Age + " " + name);
    }

    @Override
    void Profession(String name) {
        System.out.println("MainSubClass2 Test1 in the Age of" + " " + Age + " " + name);
    }
}
