package com.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // shallow copy Example
        Human prince = new Human(21, "Prince");
        Human prince2 = (Human) prince.Shallowclone();
        System.out.println(prince.name + " " + prince2.name);
        System.out.println(Arrays.toString(prince.arr) + " " + Arrays.toString(prince2.arr));
        prince2.arr[0]= 200;
        System.out.println(Arrays.toString(prince.arr) + " " + Arrays.toString(prince2.arr));

        // Deep copy Example
        Human Ram = new Human(18, "Ram");
        Human Shayam = (Human) Ram.DeepClone();
        System.out.println(Ram.name + " " + Shayam.name);
        System.out.println(Arrays.toString(Ram.arr) + " " + Arrays.toString(Shayam.arr));
        Shayam.arr[0]= 200;
        System.out.println(Arrays.toString(Ram.arr) + " " + Arrays.toString(Shayam.arr));
    }
}
