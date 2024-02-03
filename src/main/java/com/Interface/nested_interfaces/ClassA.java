package com.Interface.nested_interfaces;

public class ClassA {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class ClassB implements ClassA.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        System.out.println(num & 1);
        return (num & 1) == 1;
    }
}
