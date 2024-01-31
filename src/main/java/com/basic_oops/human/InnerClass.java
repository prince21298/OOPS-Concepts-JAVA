package com.basic_oops.human;

class Test2{
    static String name;
    public Test2(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class InnerClass {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }
    public static void main(String[] args) {
        Test2 user1 = new Test2("user1");
        Test2 user2 = new Test2("user2");
        System.out.println(user1.name);
        System.out.println(user2.name);
        System.out.println(user1);
        Test user3 = new Test("user1");
        Test user4 = new Test("user2");
        System.out.println(user3.name);
        System.out.println(user4.name);
        System.out.println(user3);
    }
}
