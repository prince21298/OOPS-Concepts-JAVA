package com.properties.inheritance;

public class BoxWeight extends BOX{
    double weight;
    public BoxWeight() {
        this.weight = this.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(double input, double weight) {
        super(input);
        this.weight = super.name;
    }

    public BoxWeight(BoxWeight data) {
        super(data);
        this.weight = data.weight;
    }
}
