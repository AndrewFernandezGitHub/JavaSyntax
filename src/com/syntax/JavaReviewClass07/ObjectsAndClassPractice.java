package com.syntax.JavaReviewClass07;

public class ObjectsAndClassPractice {

    String empName;
    int empID;
    String group;

    void employeeDetails() {
        System.out.println(empName + empID);
        System.out.println("This method shows the details of the employee");
    }

    void employeeGroup() {
        System.out.println(group);
        System.out.println("This method shows the group of the employee");
    }

    public static void main(String[] args) {
        ObjectsAndClassPractice obj = new ObjectsAndClassPractice();
        obj.employeeGroup();
        obj.employeeDetails();
    }
}