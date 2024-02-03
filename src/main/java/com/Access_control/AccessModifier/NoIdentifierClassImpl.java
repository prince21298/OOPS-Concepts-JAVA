package com.Access_control.AccessModifier;

public class NoIdentifierClassImpl extends NoIdentifierClass {
    public NoIdentifierClassImpl(int num, String name) {
        super(num, name);
    }
    int[] array ;

    public NoIdentifierClassImpl(int num, String name, int[] array) {
        super(num, name);
        this.array = array;
    }

    public static void main(String[] args) {
        NoIdentifierClass object = new NoIdentifierClass(12,"3435");
        System.out.println(object.name);
    }
}
