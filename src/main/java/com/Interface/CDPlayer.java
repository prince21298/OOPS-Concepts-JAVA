package com.Interface;

public class CDPlayer implements Media{
    @Override
    public void Start() {
        System.out.println("Start Music");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Music");
    }

    @Override
    public void PlayNext() {
        System.out.println("Play next Music");

    }

    @Override
    public void PlayPrevious() {
        System.out.println("Play previous Music");
    }
}
