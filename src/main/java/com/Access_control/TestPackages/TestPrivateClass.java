package com.Access_control.TestPackages;

import com.Access_control.AccessModifier.PrivateClass;

public class TestPrivateClass extends PrivateClass {
    public TestPrivateClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        TestPrivateClass object = new TestPrivateClass(23,"name12");
//        System.out.println(object.name);
        System.out.println(object.getName());
    }
}
