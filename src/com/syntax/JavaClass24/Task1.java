package com.syntax.JavaClass24;

//Create a Class Student that will have 3 subclasses as SyntaxStudent,
// CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the
// methods in child classes
// Define some methods specific to child classes
//Write example of achieving run time polymorphism
class Student {
    void study() {
        System.out.println("Students must study to pass");
    }

    void doHW() {
        System.out.println("Students must do Do homeworks");
    }

    void practice() {
        System.out.println("Students must to practice");
    }
}

class SyntaxStudent extends Student {
    void study() {
        System.out.println("Syntax students must study 25 hours a week");
    }

    void doHW() {
        System.out.println("Syntax students must sole Replits");
    }

    @Override
    void practice() {
        System.out.println("Syntax students must do their research");

    }
}
class CollegeStudent extends Student{
    @Override
    void doHW(){
        System.out.println("college students can skip some of the HW");
    }
}
class SchoolStudent extends Student{

}
public class Task1 {

}
