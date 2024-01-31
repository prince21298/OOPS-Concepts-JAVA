package com.basic_oops.human;

public class main {
    public static void main(String[] args) {
//        Human prince = new Human("prince",22,false);
//        Human[] allHumans = new Human[]{new Human("prince",22,false),new Human("prince1",22,false),new Human("prince2",22,false),new Human("prince3",22,false)};
//        for (int i = 0; i < allHumans.length; i++) {
//            System.out.println(allHumans[i].population);
//        }
        System.out.println(Human.population);
        Test1();
    }

    static void Test1() {
        System.out.println("Hello World");
        main obj = new main();
        obj.Test2();
    }

    void Test2() {
        System.out.println("hello World2");
    }
}
