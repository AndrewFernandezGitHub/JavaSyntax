package com.syntax.JavaClass24;

public class Task1Tester {
    public static void main(String[] args) {
        // SyntaxStudent syntaxStudent=new SyntaxStudent();
        //syntaxStudent.study();

        /*In java we can store the object of child classes in a parent
        type variable.
        every class in java can be treated as a data type
         */

        /*as we can store the object of a child class in a parent class
        we can also create an array of these students as shown below.
         */

        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();
        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};
        //int[]arr={1,2,3};
        // for (int number:arr){
        //   System.out.println(number);
        // }

//calling the methods from all the children class
        for (Student student : students) {
            student.study();
            student.doHW();
            student.practice();
        }

    }
}
