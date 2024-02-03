package com.Interface.extedTest2;

public class Main implements InterfaceA, InterfaceB {


    @Override
    public void functionA() {
        
    }

    @Override
    public void Scripted1() {
    }

    public static void main(String[] args) {
        Main object = new Main();
        object.Scripted1();
        object.functionA();
        InterfaceA.Greeting();
    }
}
