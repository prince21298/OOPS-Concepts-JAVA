package com.basic_oops.singleton;

public class singleton {
    public singleton() {

    }
    private static singleton instance;
    public static singleton getInstance(){
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }
}
