package com.Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<Type> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // working as index value.

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void addAll(Type[] num) {
        for (int i = 0; i < num.length; i++) {
            if (issFull()) {
                resizeArray();
            }
            data[size++] = num[i];
        }
    }

    private void add(Type num) {
        if (issFull()) {
            resizeArray();
        }
        data[size++] = num;
    }

    private void resizeArray() {
        Object[] tempArray = new Object[data.length * 2];
        System.arraycopy(data, 0, tempArray, 0, data.length);
        data = tempArray;
    }

    private boolean issFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "" + Arrays.toString( Arrays.copyOfRange(data,0,size));
    }

    public void remove() {
        (data[--size]) = null;
    }


    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.addAll(new Integer[]{12, 34, 6, 2345, 78, 345, 23, 42, 323, 452, 345, 234, 2345, 234, 12345, 234, 2345, 1234, 1234, 123, 2345});
        System.out.println(list);
        CustomGenericArrayList<String> listString = new CustomGenericArrayList<>();
        for (int i = 0; i <= 20; i++) {
            listString.add(Integer.toString(i));
        }
        listString.remove();
        System.out.println(listString + " Size:> " + listString.size);
    }

    ;
}
