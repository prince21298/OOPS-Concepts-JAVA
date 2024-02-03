package com.Access_control.TestPackages;

import com.Access_control.CheckPublic;
import com.Access_control.ClassA;
import com.Access_control.AccessModifier.ProtectedClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ClassA object = new ClassA(2, "Prince");
        System.out.println(object.getNum());
        System.out.println(Arrays.toString(object.getArrayData()));
        System.out.println(object.getName());
        CheckPublic objectdata = new CheckPublic(12, "name_test");
        System.out.println(objectdata.num);
        ProtectedClass objectp = new ProtectedClass(34, "234");
//        System.out.println(objectp.name); // this cannot be accessible because, the name is protected is ProtectedClass. hence this cannot be accessed in different packages, which is not a subclass of the main class.
        System.out.println(object.getName()); // in that situation.
    }
}
