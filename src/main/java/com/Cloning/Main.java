package com.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human prince = new Human(21, "Prince");
        Human prince2 = (Human) prince.clone();
        System.out.println(prince.name + " " + prince2.name);
        System.out.println(Arrays.toString(prince.arr) + " " + Arrays.toString(prince2.arr));
        prince2.arr[0]= 200;
        System.out.println(Arrays.toString(prince.arr) + " " + Arrays.toString(prince2.arr));
    }
}
