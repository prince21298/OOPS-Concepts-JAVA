package com.Generic.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numArray.add(i);
        }
        numArray.forEach((element) -> System.out.println("Output " + element * 2));
        Consumer<Integer> fun = (items) -> System.out.println("Output2 " + items * 2);
        numArray.forEach(fun);
        Operation1 sum = Integer::sum; // Sum method of lambda.
        Operation1 subtract = (a, b) -> a - b;
        Operation1 multiply = (a, b) -> a * b;
        Operation1 modules = (a, b) -> a % b;
        Operation1 divide = (a, b) -> a / b;
        LambdaFunction function = new LambdaFunction();
        System.out.println(function.operate(sum));
        System.out.println(function.operate(subtract));
        System.out.println(function.operate(multiply));
        System.out.println(function.operate(modules));
        System.out.println(function.operate(divide));
    }

    private int operate(Operation1 op) {
        return op.operation(2, 3);
    }
}

interface Operation1 {
    int operation(int a, int b);
}
