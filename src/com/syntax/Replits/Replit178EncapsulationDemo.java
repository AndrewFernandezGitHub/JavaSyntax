package com.syntax.Replits;


//this code is works
public class Replit178EncapsulationDemo {
    private String empName;
    private int empAge;


    public void setEmpName(String empName) {
        if (empName.length() > 1) {
            this.empName = empName;
        } else {
            System.out.println("Name must be provided");
        }
    }

    public void setEmpAge(int empAge) {
        if (empAge > 18){
            this.empAge = empAge;
        }
        else {
            System.out.println("Employee must be at least 18");
        }
    }

    public String getEmpName() {
        return this.empName;
    }

    public int getEmpAge() {
        return this.empAge;
    }
}
class R178EncapsulationMain {
    public static void main(String[] args) {
        Replit178EncapsulationDemo encapsulationDemo = new Replit178EncapsulationDemo();
        encapsulationDemo.setEmpName("John");
        encapsulationDemo.setEmpAge(30);
        System.out.println("Employee Name: " + encapsulationDemo.getEmpName());
        System.out.println("Employee Age: " + encapsulationDemo.getEmpAge());
    }
}