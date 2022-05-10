package com.syntax.Replits;

public class Replit178Encapsulation2 {
    /*  Encapsulation
      Create Class EncapsulationDemo
      create two variable as shown below.
      private String empName;
      private int empAge;
      Create the getter/setter methods for each variable.
      In Main Class and main method.
      Using setter methods assign the values as "John" and "30"
      Using getter methods print the values as below outputs.
      Expected Output:
      Employee Name: John
      Employee Age: 30
     */
    public static void main(String[] args) {

        EncapsulationDemo object = new EncapsulationDemo();
        object.setEmpName("John");
        object.setEmpAge(30);
        System.out.println("Employee Name: " + object.getEmpName());
        System.out.println("Employee Age: " + object.getEmpAge());
    }
}

class EncapsulationDemo {
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}

