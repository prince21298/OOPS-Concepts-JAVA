package com.Interface;

public class PowerEngine implements Engine{
    @Override
    public void Start() {
        System.out.println("Start Power Engine");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Power Engine");
    }

    @Override
    public void Acc() {
        System.out.println("Accelerate Power Engine");
    }
}
