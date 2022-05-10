package com.syntax.Replits;

public class Replit146ThisKeyword {
    public static void main(String[] args) {
        ReplEmployee obj1=new ReplEmployee();
        ReplEmployee obj2=new ReplEmployee("Joe","Smith",12345,"01/01/1970",35000);
        obj1.Display();
        obj2.Display();
    }
}
class ReplEmployee{
String name;
String lastName;
int employeeId;
String startDate;
int salary;
ReplEmployee(){
name=null;
lastName=null;
employeeId=0;
startDate=null;
salary=0;}
    ReplEmployee(String name,String lastName,int employeeId,String startDate,int salary){
    this.name=name;
    this.lastName=lastName;
    this.employeeId=employeeId;
    this.startDate=startDate;
    this.salary=salary;
    }
    void Display(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }
}
