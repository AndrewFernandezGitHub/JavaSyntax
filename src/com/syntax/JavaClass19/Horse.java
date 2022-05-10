package com.syntax.JavaClass19;

public class Horse {
   private String name;
   private int age;
   private double weight;
// Rule 1-constructors dont have return types like int string or even void
   //purpose of constructor is to give initial values to the fields of a class
   Horse(String horseName,int horseAge,double horseWeight){
       name=horseName;
       age=horseAge;
       weight=horseWeight;
   }
// no  argument/zero argument constructor
    Horse(){
      /* write some important lines of code that you want to execute when
      the object of a class is created for example
      you might want to fetch some info from internet or from your
      hard disk to give initial vales to the fields
       */
    }
   //Rule 2-Name of the constructor should be same as name of the class
   void printHorseName(){
       System.out.println("Name "+name);
   }
   void setName(String horseName){
       name=horseName;
   }
}
