package com.properties.Abstraction;

import java.util.ArrayList;

/*
* Hiding the unnecessary details and only showing the essential information.
* */
public class Abstraction {
    public static void main(String[] args) {
        System.out.println("Hello I am.");// For printing a text of input. In that whole process, many things are written but all a hidden from us this known as Abstraction. On the other hand, the process that has been made to print given input that's known as Encapsulation.
        /*
        * Abstraction focus on external stuffs.
        * Abstraction is a process of gaining information.
        * Data hiding is focused on data security.
        * */
        ArrayList list = new ArrayList();
        System.out.println(list.add(2));
        System.out.println(list);
    }
}
