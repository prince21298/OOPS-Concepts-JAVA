package com.Access_control;

public class ClassA {
    private int num;
    private String name;

    private int[] ArrayData;

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

    public int[] getArrayData() {
        return ArrayData;
    }

    public void setArrayData(int[] arrayData) {
        ArrayData = arrayData;
    }

    public ClassA() {
    }

    public ClassA(int num, String name) {
        this.num = num;
        this.name = name;
        this.ArrayData = new int[num];
    }
}
