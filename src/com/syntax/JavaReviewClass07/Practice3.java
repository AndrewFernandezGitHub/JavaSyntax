package com.syntax.JavaReviewClass07;

public class Practice3 {

    String studentName;
    String course;
    int studentId;
    int grades;

    void displayStudentsRecord(){
        System.out.println("The student name is "+studentName+" and the course student enrolled for is "+course);
        System.out.println("The student id is "+studentId+" and the grades student achieved are "+grades);
    }

    public static void main(String[] args) {
        //creating the first object of class to assign first set of values
        Practice3 p1=new Practice3();
        p1.studentName="Andrew";
        p1.studentId=123;
        p1.course="SDET";
        p1.grades=65;
        p1.displayStudentsRecord();

        System.out.println("----------------------------------");

        //creating the second object of class to assign second set of values
        Practice3 p2=new Practice3();

        p2.studentName="Marcela";
        p2.studentId=121;
        p2.course="SDET";
        p2.grades=73;
        p2.displayStudentsRecord();
    }
}
