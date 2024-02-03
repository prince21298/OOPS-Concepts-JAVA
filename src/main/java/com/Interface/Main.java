package com.Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.Acc();
        car.Start();
        car.Stop();
        car.Brakes();
        car.PlayNext();
        car.PlayPrevious();


        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.stop();
        niceCar.Acc();
        niceCar.Brakes();
        niceCar.startMusic();
        niceCar.stopMusic();
        niceCar.playNextMusic();
        niceCar.upgradeEngine();
        niceCar.start();

    }
}
