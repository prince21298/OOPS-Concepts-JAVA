package com.Access_control.TestPackages;

import com.Access_control.AccessModifier.NoIdentifierClass;

public class TestNoIdentifierClass {
    public static void main(String[] args) {
        NoIdentifierClass object4 = new NoIdentifierClass(23, "test1");
        // System.out.println(object4.name);// this cannot be accessible because, the name doesn't have an identifier is NoIdentifierClass. hence this cannot be accessed in different packages.
    }
}
