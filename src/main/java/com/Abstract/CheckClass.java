package com.Abstract;

public class CheckClass {
    public static void main(String[] args) {
        MainSubClass object = new MainSubClass(23);
        object.Profession("Reading");
        object.Passion("Reading");
        object.Carrer("Reading");

        MainSubClass2 object2 = new MainSubClass2(23);
        object2.Profession("Dancer");
        object2.Passion("Dancer");
        object2.Carrer("Dancer");
        Main.getCall();
        object2.normalModifier(23);
        object.normalModifier(34);
        Main objec5 = new MainSubClass(23);
        System.out.println(objec5.Age);

    }
    /*Main objectCheck = new Main(23) {
        @Override
        void Carrer(String name) {

        }

        @Override
        void Passion(String name) {

        }

        @Override
        void Profession(String name) {

        }
    };*/   // we can't create an object from abstract class it will always ask for create override methods.

}
