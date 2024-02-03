package com.Access_control.AccessModifier;

public class PrivateClassImpl extends PrivateClass {
    public PrivateClassImpl(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        PrivateClass object = new PrivateClass(23, "name1");
        // System.out.println(object.name); // This cannot be accessible because, the name doesn't private identifier is PrivateClass. hence this cannot be accessed in subclass.
        // so we use getter or setter method.
        System.out.println(object.getName());
    }
}
