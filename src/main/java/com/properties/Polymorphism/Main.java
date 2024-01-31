package com.properties.Polymorphism;

//


public class Main {
    int i;
    int i1;

    public Main(int i, int i1) {
        this.i = i;
        this.i1 = i1;
    }

    public Main() {
    }

    public void test1 (){
        System.out.println("Hello1");
    }

    public static void main(String[] args) {

        Main MainObject = new Main();
        MainObject.test1();
        Number NumObject = new Number();
        NumObject.test1();


        // Method overloading :> same name but arguments return types and ordering can be diffrent.
        Species allSpecies = new Species();
        Human human1 = new Human();
        Animal anmimal1 = new Animal();
        Insects insects1 = new Insects();
        Reptile reptile1 = new Reptile();
        Species TestCase1 = new Reptile();
        TestCase1.prefrence();

        // Compile time polymorphism. Also known as Static polymorphism.
        Main a = new Main();
        Main a2 = new Main(1, 2);
    }
}
