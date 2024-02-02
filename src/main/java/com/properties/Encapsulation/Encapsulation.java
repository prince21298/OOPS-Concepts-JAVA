package com.properties.Encapsulation;

import java.util.ArrayList;

/*
  wrapping up the implementation of the data members and method in a class.
* */
public class Encapsulation {
    private double number;

    public Encapsulation() {

    }

    public Encapsulation(double number) {
        this.number = number;
    }

    public void setNumber(double number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return Double.toString(number);
    }

    public double getNumber() {
        return number;
    }

    public static void main(String[] args) {
        System.out.println("Hello I am."); // The process that has been made to print our given input, that known as Encapsulation

        /*
        * Encapsulation focus on internal working or Implementation.
        * Encapsulation is a process of containing information.
        * Encapsulation is focused on hiding the complicity of the system.
        * */
        ArrayList list = new ArrayList();
        System.out.println(list.add(2));
        System.out.println(list);

    }
}
