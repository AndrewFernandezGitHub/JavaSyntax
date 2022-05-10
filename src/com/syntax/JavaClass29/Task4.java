package com.syntax.JavaClass29;

import java.util.HashSet;

/*create a Set Collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.Each student object should have
name and studentID.Display name of each student
 */
public class Task4 {
    public static void main(String[] args) {
        HashSet<Student> students=new HashSet<>();
        students.add(new Student("Andrew","123"));
        students.add(new Student("Marcela","1234"));
        students.add(new Student("Alex","12345"));
        for (Student s:students){
            s.printName();
        }
    }
}
class Student{
    String name;
    String studentId;
    Student(String name,String studentId){
        this.name=name;
        this.studentId=studentId;
    }
    void printName(){
        System.out.println(name);
    }
}
