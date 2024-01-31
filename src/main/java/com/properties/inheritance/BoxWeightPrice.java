package com.properties.inheritance;

public class BoxWeightPrice extends BoxWeight {
    double ProductPrice;

    public BoxWeightPrice() {
        super();
        this.ProductPrice = -1;
    }

    public BoxWeightPrice(double l, double h, double w, double weight, double ProductPrice) {
        super(l, h, w, weight);
        this.ProductPrice = ProductPrice;
    }

    public BoxWeightPrice(BoxWeightPrice dataObject) {
        super(dataObject);
        this.ProductPrice = dataObject.ProductPrice;
    }

    public BoxWeightPrice(double input, double weight, double productPrice) {
        super(input, weight);
        ProductPrice = productPrice;
    }

    public static void main(String[] args) {

    }
}
