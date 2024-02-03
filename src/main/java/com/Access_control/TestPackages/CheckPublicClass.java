package com.Access_control.TestPackages;

import com.Access_control.CheckPublic;

public class CheckPublicClass extends CheckPublic{
    public CheckPublicClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        CheckPublic objectdata = new CheckPublic(12,"test1");
        System.out.println(objectdata.num + " " + objectdata.name);
    }
}
