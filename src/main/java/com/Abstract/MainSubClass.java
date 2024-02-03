package com.Abstract;

public class MainSubClass  extends Main{

    @Override
    void normalModifier(int Number1) {
        super.normalModifier(Number1);
    }

    public MainSubClass(int age) {
        super(age);
    }

    @Override
    void Carrer(String name) {
        System.out.println("MainSubClass Test1 in the Age of" + " " + Age + " " + name);
    }

    @Override
    void Passion(String name) {
        System.out.println("MainSubClass Test2 in the Age of" + " " + Age + " " + name);
    }

    @Override
    void Profession(String name) {
        System.out.println("MainSubClass Test3 in the Age of" + " " + Age + " " + name);
    }
}
