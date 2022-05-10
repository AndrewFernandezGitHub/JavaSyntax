package com.syntax.JavaClass24;

public interface Employee {
    public static final int age=10;
    void work();
    /*All the methods inside an interface which do not have body are abstract public
by default all variables ininterface are public, static, and final
     */

}
class Tester implements Employee{
    @Override
    public void work(){
        System.out.println("Testing a website");
    }
    public static void main (String [] args){
        Tester tester=new Tester();
        tester.work();
        System.out.println(Employee.age);

    }
}
