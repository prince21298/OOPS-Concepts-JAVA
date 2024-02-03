package com.Access_control.AccessModifier;

public class PrivateClass {
    private int num;
    private String name;

    public PrivateClass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        PrivateClass objectData = new PrivateClass(34, "wertyu");
        System.out.println(objectData.name + " " + objectData.num);
    }
}
