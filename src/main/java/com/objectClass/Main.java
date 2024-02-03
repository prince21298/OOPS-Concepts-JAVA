package com.objectClass;

public class Main {
    int number;
    String name;

    public Main(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Main(int number) {
        this.number = number;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Main() {
        super();
    }

    public static void main(String[] args) {
        Main object  = new Main(35);
        Main object1  = new Main(35);
        System.out.println(object.number);
        System.out.println(object.hashCode());
        System.out.println(object1.hashCode());
        System.out.println(object1.number == object.number);
        System.out.println(object.equals(object));
        System.out.println(object.toString());
        System.out.println(object instanceof Main);
        System.out.println(object instanceof Main);
        System.out.println(object.getClass().getName());
//        System.out.println(object.clone(34));
    }
}
