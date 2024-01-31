package com.properties.Polymorphism;

public class Number {
    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
    void test1(){
        System.out.println("Hello2");
    }


    public static void main(String[] args) {
        // Compile time polymorphism. Also known as Static polymorphism.
        Number Methods = new Number();
        System.out.println(Methods.sum(1,3));
        System.out.println(Methods.sum(1,2));

        // Runtime or Dynamic polymorphism. Acchived by method overriding.
        /*
        Parent object = new Child();
        Here which method will be called Child
        this is known as up casting and this entire things known as Overriding how this works.
        * */
    }
}
