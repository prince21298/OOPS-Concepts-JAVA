package com.properties.Polymorphism;

public class PrintClass {
    static  int number;

    public PrintClass(int num) {
        number = num;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }

    public static void main(String[] args) {
        PrintClass object = new PrintClass(3);
        System.out.println(object);
    }
}

