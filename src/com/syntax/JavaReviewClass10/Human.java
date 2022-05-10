package com.syntax.JavaReviewClass10;

import com.syntax.JavaClass24.Employee;

public class Human {
    private String name;
    private String color;
    private int age;

    Human(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
        System.out.println("Inside the parent class Human");
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
class Employees extends Human{

    String employeeId;
    Employees(String name, String color, int age,String employeeId) {
        super(name, color, age);
        this.employeeId=employeeId;
    }
}
class Teacher extends Employees{
    String favSubject;
    Teacher(String name, String color, int age, String employeeId,String favSubject){
        super (name,color,age,employeeId);
        this.favSubject=favSubject;
    }
}
class Tester123{
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Andrew","Yellow",22,"123","Java");
        teacher.printInfo();
    }
}