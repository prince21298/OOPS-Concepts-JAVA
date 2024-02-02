package com.properties.Encapsulation;

public class Main {
    public static void main(String[] args) {
        /*
        * In the scenario Encapsulation class have getNumber Constructor that returns private defined number variable. So that process of Implementation is known as Encapsulation.
        * Get or Set a private variable from another class through a constructor, that constructor known as Encapsulation. On the other side, that variable cannot access that's known as data-hiding.
        *
        * */
        Encapsulation object1 = new Encapsulation();
        System.out.println(object1);
        System.out.println(object1.getNumber());
    }
}
