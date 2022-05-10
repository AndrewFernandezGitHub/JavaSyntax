package com.syntax.JavaClass17;
//Create a Class called Students
//Create three  variables  Name , ID  and  numberOfStudents
//Create three objects of the Students Class
//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//Print out  total number of students
public class VariableTask {
    String name;
    String id;
    static int numberOfStudents;


    public static void main(String[] args) {
        VariableTask student1=new VariableTask();

    student1.name="Andrew";
    student1.id="123";
    student1.numberOfStudents++;

        VariableTask student3=new VariableTask();

        student3.name="Maria";
        student3.id="141";
        student3.numberOfStudents++;

        VariableTask student2=new VariableTask();

        student2.name="Marcela";
        student2.id="345";
        student2.numberOfStudents++;
        System.out.println(VariableTask.numberOfStudents);

    }
}
