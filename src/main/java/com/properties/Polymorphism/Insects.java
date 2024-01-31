package com.properties.Polymorphism;

public class Insects extends Species{
    // this will get execute when object of Animal will create, hence it's overriding parent class prefrence.
    @Override  // this ia annotation
    void prefrence(){
        System.out.println("I have specefic preference (Insect)");
    }
}
