package com.Generic.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Students implements Comparable<Students> {
    int rollNo;
    float marks;

    public Students(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }


    @Override
    public int compareTo(Students o) {
        float diff = this.marks - o.marks;
        if (diff < 0 && diff > -1) {
            return -1;
        } else if (diff > 0 && diff < 1) {
            return 1;
        }
        else{
            return (int) diff;
        }
    }

    @Override
    public String toString() {
        return "{ rollNo: " +  rollNo + ", Marks: " +  + marks + " }";
    }
}

class Main {
    public static void main(String[] args) {
        Students Irish = new Students(21, 89.76f);
        Students Rahul = new Students(32, 88.99f);
        Students Neha = new Students(11, 98.42f);
        Students Kajal = new Students(12, 82.99f);
        Students Aawal = new Students(34, 81.89f);
        Students Naval = new Students(53, 88.68f);
        Students Kawal = new Students(45, 84.45f);
        Students[] allStudents = new Students[]{Irish,Rahul,Naval,Neha,Aawal,Kawal,Kajal};
        System.out.println(Arrays.toString(allStudents));
        Arrays.sort(allStudents, (o1, o2) -> o2.rollNo-o1.rollNo); // lambda function
//        Arrays.sort(allStudents, new Comparator<Students>() {
//            @Override
//            public int compare (Students o1, Students o2) {
//                return o2.rollNo-o1.rollNo;
//            }
//        }); // normal compare method using constructor of Arrays.
        System.out.println(Arrays.toString(allStudents));
        if (Irish.compareTo(Rahul) < 0) {
            System.out.println("rahul have more marks");
        } else {
            System.out.println(  " have less marks");
        }
    }
}
