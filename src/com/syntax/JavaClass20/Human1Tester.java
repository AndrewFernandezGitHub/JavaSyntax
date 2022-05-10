package com.syntax.JavaClass20;

public class Human1Tester {
    public static void main(String[] args) {
        Student student =new Student();
        student.name="Andrew";
        System.out.println(student.name);
        student.printName();
        student.studentId="123";
        student.age=12;
        Principal principal=new Principal();
        principal.name="Andrew";
        principal.printName();
        principal.specialParkingSlot=false;
    }
}
