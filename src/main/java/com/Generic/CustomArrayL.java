package com.Generic;

import java.util.Arrays;

public class CustomArrayL {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // working as index value.

    public CustomArrayL() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void addAll(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (issFull()) {
                resizeArray();
            }
            data[size++] = num[i];
        }
    }
    private void add(int num) {
        if (issFull()) {
            resizeArray();
        }
        data[size++] = num;
    }

    private void resizeArray() {
        int[] tempArray = new int[data.length * 2];
        System.arraycopy(data, 0, tempArray, 0, data.length);
        data = tempArray;
    }

    private boolean issFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "" + Arrays.toString(data);
    }

    public void remove() {
        data[--size] = 0;
    }




    public static void main(String[] args) {
        CustomArrayL list = new CustomArrayL();
        list.addAll(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 4, 67, 88, 765, 543, 54, 43, 4, 3, 4, 34});
        System.out.println(list);
        list.remove();
        System.out.println(list + " " + list.size);
        list.add(43);
        System.out.println(list + " " + list.size);
        for (int i = 0; i < 20; i++) {
            list.add(i*i);
        }
        System.out.println(list + " " + list.size);

    };
}
