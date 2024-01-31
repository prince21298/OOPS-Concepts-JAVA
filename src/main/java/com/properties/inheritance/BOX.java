package com.properties.inheritance;

public class BOX {
    double l;
    double h;
    double w;
    double name = 5;

    public BOX(double l, double h, double w) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public BOX() {
        this.l = this.l;
        this.h = this.h;
        this.w = this.w;
    }
    public BOX(double input) {
        this.l = input;
        this.h = input;
        this.w = input;
    }

    BOX(BOX oldbox) {
        this.l = oldbox.l;
        this.h = oldbox.h;
        this.w = oldbox.w;
    }

    public  void information() {
        System.out.println("Box running!! ");
    }

    public static void main(String[] args) {

    }
}