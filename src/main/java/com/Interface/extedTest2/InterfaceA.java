package com.Interface.extedTest2;

public interface InterfaceA {
    void functionA();

    default void Scripted1() {
        System.out.println("I m default functionA");
    }

    // static interface should always have a body
    // call via the interface name
    static void Greeting(){
        System.out.println("Hey I am Static method");
    }
}
