package com.Access_control;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ClassA data = new ClassA(2,"Test1");
        data.setArrayData(new int[5]);
        System.out.println(Arrays.toString(data.getArrayData()));
        data.setName("Test2");
        System.out.println(data.getName());
        data.setNum(10);
        System.out.println(data.getNum());

        CheckPublic object = new CheckPublic(12,"name");
        System.out.print(object.name + " "+ object.num);
    }
}
