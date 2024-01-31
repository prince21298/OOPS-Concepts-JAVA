package com.basic_oops;

public class mainData {

    public static void main(String[] args) {
        Student prince = new Student(12,"prince",(float) 97.02); //single
        Student aryan = new Student(11,"Aryan",(float) 98.00); // single
        Student default_user = new Student(); // single
        prince.changesName("Mohit"); // rename
        Student[] allStudents = new Student[]{new Student(12,"prince",(float) 97.02),new Student(12,"prince",(float) 97.02),new Student()};
        for (Student student : allStudents) {
            System.out.println(student.name);
        }
        System.out.println(aryan.name);
        System.out.println(default_user.marks);
        float floatValue = (float) 510.00;
        System.out.println(floatValue);
    }
}

class Student {
    Student(){
        this(1, "default_user", (float) 99.99);
    }
    Student(int rool_num, String name, float percentages) {
        this.marks = percentages;
        this.r_num = rool_num;
        this.name = name;
    }
    void changesName(String nameString){
        this.name = nameString;
    }
    int r_num;
    String name;
    float marks;
}
