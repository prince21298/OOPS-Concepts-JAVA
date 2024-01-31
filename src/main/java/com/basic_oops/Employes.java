package com.basic_oops;

public class Employes {

    int id;
    String name;
    double salary;

    public Employes(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employes() {
    }

    @Override
    public String toString() {
        return String.format("{name:\"%s\",id:%d,salary:%f}", name, id, salary);
    }

    public Employes(int i, String defaultUser2) {
        this.id = i;
        this.name = defaultUser2;
    }

    int GetbyId(int id) {
        return id;
    }

    String GetbyName(String name) {
        return name;
    }

    double GetbySalary(double salary) {
        return salary;
    }


    int SetbyId(int id) {
        return id;
    }

    String SetbyName(String name) {
        return name;
    }

    double SetbySalary(double salary) {
        return salary;
    }


}
