package com.Collections;

public class EnumExamples {
    enum WEEK implements Hello{
        Monday,Tuesday, Wednesday, Thrusday, Friday, saturday, sunday; // these are enum constant.
        // by default, they are a public static final
        //since they are final you cannot create child enums.
        // type is week.
        WEEK() {
            System.out.println("Constructor called for " + this.toString());
        }
        @Override
        public void hello() {
            System.out.println("Hello, How are you!!");
        }

        // This is not public or protected.
        // Why? We don't want to create new Object as this is enums.
        // This is not the enum concept.
    }

    public static void main(String[] args) {
        WEEK week;
        week = EnumExamples.WEEK.Monday;
        System.out.println(week);
        week.hello();
        System.out.println(WEEK.valueOf("Monday"));
//        for (WEEK day : WEEK.values()){
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal()); // it will always 0


    }

}
