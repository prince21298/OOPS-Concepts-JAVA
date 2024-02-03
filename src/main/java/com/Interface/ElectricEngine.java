package com.Interface;

public class ElectricEngine implements Engine{
    @Override
    public void Start() {
        System.out.println("Start Electric Engine");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Electric Engine");
    }

    @Override
    public void Acc() {
        System.out.println("Accelerate Electric Engine");
    }
}
