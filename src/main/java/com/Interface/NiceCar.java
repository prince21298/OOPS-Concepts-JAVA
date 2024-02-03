package com.Interface;

public class NiceCar {

    private Engine engine;
    private Media player = new CDPlayer();
    private Brakes brakes = new BrakesCar();

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public NiceCar() {
        engine = new PowerEngine();
    }

    public void start() {
        engine.Start();
    }

    public void stop() {
        engine.Stop();
    }

    public void Acc() {
        engine.Acc();
    }

    public void Brakes() {
        brakes.Brakes();
    }

    public void startMusic() {
        player.Start();
    }

    public void stopMusic() {
        player.Stop();
    }

    public void playNextMusic() {
        player.PlayNext();
    }

    public void playPreviousMusic() {
        player.PlayPrevious();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
