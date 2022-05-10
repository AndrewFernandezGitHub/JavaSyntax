package com.syntax.Replits;

public class Replit180Encapsulation {
    private String empName = "John";
    private int empAge = 30;

    public String getEmpName() {
        return this.empName;
    }

    public int getEmpAge() {
        return this.empAge;
    }
}

class R180Main {
    public static void main(String[] args) {
        Replit180Encapsulation encapsulation = new Replit180Encapsulation();
        System.out.println("Employee Name: " + encapsulation.getEmpName());
        System.out.println("Employee Age: " + encapsulation.getEmpAge());
    }
}