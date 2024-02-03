package com.Interface;

public class Car implements Engine, Brakes, Media {

    @Override
    public void Brakes() {
        System.out.println("I brake like a normal car!!");
    }

    @Override
    public void Start() {
        System.out.println("I Start like a normal car!!");
    }

    @Override
    public void Stop() {
        System.out.println("I stop like a normal car!!");

    }

    @Override
    public void PlayNext() {
        System.out.println("I play next song like a normal car!!");
    }

    @Override
    public void PlayPrevious() {
        System.out.println("I play previous song like a normal car!!");
    }

    @Override
    public void Acc() {
        System.out.println("I accelerate like a normal car!!");
    }
}
