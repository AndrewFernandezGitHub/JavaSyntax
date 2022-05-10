package com.syntax.JavaClass21;
public class Parent {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}
class Child1 extends Parent{
    String name="Child";
    void printName(){
        String name="Andrew";//first priority given to local variable
        System.out.println(name);
        /*when we use "this" keyword, even though we have a local variable
        and java will only bring the values from instance variables
        */
        System.out.println(this.name);
        /*when we us the super keyword even though we have a local variable
        and instance variables inside the same class
        java will only bring the values from parent clas instance variables
         */
        System.out.println(super.name);
    }
}
class ParentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName();
    }
}