package com.Cloning;

public class Human implements Cloneable{
    int age;
    String name;

    int[] arr = {3,4,5,6,7,8,9,1};
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // this is a shallow copy
    public Object Shallowclone() throws CloneNotSupportedException {
        return super.clone();
    }

    // this is a deep copy
    public Object DeepClone() throws CloneNotSupportedException {
        Human copyHuman = (Human) super.clone();
        copyHuman.arr = new int[copyHuman.arr.length];
        System.arraycopy(this.arr,0,copyHuman.arr,0, copyHuman.arr.length);
        return copyHuman;

    }
}
