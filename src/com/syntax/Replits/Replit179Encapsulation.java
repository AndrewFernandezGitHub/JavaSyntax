package com.syntax.Replits;

public class Replit179Encapsulation {
    String empName;
    int empAge;
    Replit179Encapsulation(){
    }
    public void setEmpName(String empName){
        if (empName.length()>1){
            this.empName=empName;
        }else {
            System.out.println("Name must be provided");
        }
    }
    public void setEmpAge(int empAge){
        if(empAge>18){
            this.empAge=empAge;
        }else {
            System.out.println("Employee must be at least 18");
        }
    }
    public String getEmpName(){
        return this.empName;
    }

    public int getEmpAge() {
        return this.empAge;
    }
}
class R179Main{
    public static void main(String[] args) {
        Replit179Encapsulation encapsulation=new Replit179Encapsulation();
        encapsulation.setEmpName("Mario");
        encapsulation.setEmpAge(32);
        System.out.println("Employee Name: "+encapsulation.getEmpName());
        System.out.println("Employee Age: "+encapsulation.getEmpAge());
    }
}
