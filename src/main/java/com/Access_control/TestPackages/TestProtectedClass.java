package com.Access_control.TestPackages;

import com.Access_control.AccessModifier.ProtectedClass;

public class TestProtectedClass extends ProtectedClass {
    public TestProtectedClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        ProtectedClass object = new ProtectedClass(23,"23");
    }
}
