package com.syntax.JavaClass28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Students andrew=new Students("Andrew",20,"Memes");
        Students marcela=new Students("Marcela",21,"Bravo");
        Students joe=new Students("Joe",30,"Music");

        LinkedList<Students> studentsLinkedList=new LinkedList<>();
        studentsLinkedList.add(andrew);
        studentsLinkedList.add(marcela);
        studentsLinkedList.add(joe);
    }
}
class Students{
    public Students (String name,int age, String hobbies){
        this.name=name;
        this.age=age;
        this.hobbies=hobbies;
    }
    String name;
    int age;
    String hobbies;
//to get below, type in to, then enter twice on the toString method
    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
