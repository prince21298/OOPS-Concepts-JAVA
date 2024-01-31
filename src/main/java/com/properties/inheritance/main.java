package com.properties.inheritance;

public class main {
    public static void main(String[] args) {
        BOX object = new BOX();
        System.out.println(object.l + " " + object.h + " " + object.w);
        BOX object1 = new BOX(1.2);
        System.out.println(object1.l + " " + object1.h + " " + object1.w);
        BOX object2 = new BOX(2.1, 3.5, 5.4);
        System.out.println(object2.l + " " + object2.h + " " + object2.w);
        BOX object3 = new BOX(object2);
        System.out.println(object3.l + " " + object3.h + " " + object3.w);

        // single Inheritance :> when a parent class inheritate child class.
        BoxWeight object4 = new BoxWeight();
        System.out.println(object4.l + " " + object4.h + " " + object4.w);
        System.out.println(object4.l + " " + object4.h + " " + object4.w + " " + object4.weight);
        BoxWeight object5 = new BoxWeight(1, 5);
        System.out.println(object5.l + " " + object5.h + " " + object5.w + " " + object5.weight);
        BoxWeight object7 = new BoxWeight(1, 2, 3, 4);
        System.out.println(object7.l + " " + object7.h + " " + object7.w + " " + object7.weight);
        BOX object6 = new BoxWeight(object7);
        System.out.println(object6.l + " " + object6.h + " " + object6.w + " " + ((BoxWeight) object6).weight);

        // Single Level Inhertance. :> when a parent class inheritate child and that child class also inheritate other class.
        BoxWeightPrice object8 = new BoxWeightPrice();
        System.out.println(object8.l + " " + object8.h + " " + object8.w + " " + object8.weight + " " + object8.ProductPrice);
        BoxWeightPrice object9 = new BoxWeightPrice(1, 2, 3, 40, 5000);
        System.out.println(object9.l + " " + object9.h + " " + object9.w + " " + object9.weight + " " + object9.ProductPrice);
        BoxWeightPrice object10 = new BoxWeightPrice(object8);
        System.out.println(object10.l + " " + object10.h + " " + object10.w + " " + object10.weight + " " + object10.ProductPrice);
        BoxWeightPrice object11 = new BoxWeightPrice(object9);
        System.out.println(object11.l + " " + object11.h + " " + object11.w + " " + object11.weight + " " + object11.ProductPrice);
        BOX object13 = new BoxWeightPrice(object9);
        System.out.println(object13.l + " " + object13.h + " " + object13.w + " " + ((BoxWeightPrice) object13).weight + " " + ((BoxWeightPrice) object13).ProductPrice);
        BOX object12 = new BoxWeightPrice(object9);
        System.out.println(object12.l + " " + object12.h + " " + object12.w + " " + ((BoxWeightPrice) object12).weight + " " + ((BoxWeightPrice) object12).ProductPrice);
        BoxWeightPrice object14 = new BoxWeightPrice(4, 2, 4500);
        System.out.println(object14.l + " " + object14.h + " " + object14.w + " " + object14.weight + " " + object14.ProductPrice);

        // Multiple Inheritance :> Java doesn't support  Multiple Inheritance.
        // Hierarchical Inheritance :> when parent class Inheritate many other child class.

        //Hybrid Inheritance :> it's a combination of single and multiple Inheritance. As Java doesn't support  multiple Inheritance, this also not exists in java.
    }
}
