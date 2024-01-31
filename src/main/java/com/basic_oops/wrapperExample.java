package com.basic_oops;


public class wrapperExample {
    public static void main(String[] args) {
        main2(null);
        int a = 45;
        int b = 34;
        // Integer num = 56;
        swap(a, b);
        System.out.println(b);
        System.out.println(a);
        A prince = new A("Prince");
        System.out.println(prince);
        message.message();
    }

    static void main2(String arg) {
        Integer a = 45;
        Integer b = 34;
        swapInteger(a, b);
        System.out.println(b);
        System.out.println(a);
    }

    static void swap(int a, int b) {
        int tempValue = a;
        b = a;
        a = tempValue;
    }

    static void swapInteger(Integer a, Integer b) {
        Integer tempValue = a;
        b = a;
        a = tempValue;
    }
}

/**
 * InnerwrapperExample
 */
class A {
    int number;
    String name;

    A(String namString) {
        this.name = namString;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Somethig getting Destroyed");
    }
}
