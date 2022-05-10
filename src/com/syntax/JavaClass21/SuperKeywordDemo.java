package com.syntax.JavaClass21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
    }
}
class GrandParent{
    String color="Blue";
}
class Parents extends GrandParent {
    String color="Black";
}
class Child extends Parents{
    String color="Red";
    void printColor(){
        String color="Green";//java prefers local variable over instance variab;es
        //refers to local variable
        System.out.println(color);
        //refers to instances variable
        System.out.println(this.color);
        //refers to parent variable
        System.out.println(super.color);
    }
}