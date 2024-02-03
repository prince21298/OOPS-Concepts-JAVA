package com.Access_control.AccessModifier;

public class ProtectedClassImpl extends ProtectedClass {
    public ProtectedClassImpl(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        ProtectedClass object = new ProtectedClass(12,"2456");
        System.out.println(object.name);
    }
}
