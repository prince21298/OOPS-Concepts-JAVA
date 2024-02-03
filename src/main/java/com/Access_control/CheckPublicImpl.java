package com.Access_control;

public class CheckPublicImpl extends CheckPublic {
    public CheckPublicImpl(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        CheckPublic object = new CheckPublic(12,"name");
        System.out.println(object.name);
    }
}
