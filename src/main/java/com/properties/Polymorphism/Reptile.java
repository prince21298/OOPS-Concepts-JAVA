package com.properties.Polymorphism;

public class Reptile extends Species {
    // this will get execute when object of Animal will create, hence it's overriding parent class preference.
    @Override  // this ia annotation
    void prefrence(){
        System.out.println("I have specific preference (Reptile)");
    }

}
