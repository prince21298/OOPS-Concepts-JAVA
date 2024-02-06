package com.Generic;

import java.util.ArrayList;

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList newArrayList = new ArrayList();
        newArrayList.add(24);
        newArrayList.add(32);
        System.out.println(newArrayList);
        newArrayList.remove(0);
        System.out.println(newArrayList);
        System.out.println(newArrayList.get(0));
        newArrayList.add(24);
        newArrayList.add(32);
        newArrayList.add(24);
        newArrayList.add(32);
        newArrayList.add(24);
        newArrayList.add(32);
        System.out.println(newArrayList);
        newArrayList.set(3,678);
        System.out.println(newArrayList);
        System.out.println(newArrayList.isEmpty());
        System.out.println(newArrayList.size());


    }
}
