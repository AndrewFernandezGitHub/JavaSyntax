package com.syntax.Replits;

public class Replit158SuperKeyword {
}
class R158Super{
    public static void main(String[] args) {
        Child158 obj1=new Child158("Fairfax");
        obj1.display();
    }
}
class Parent158{
    String city;

    Parent158(String city){
        this.city=city;
    }
    public void display(){
        System.out.println("City name "+city);
    }
}
class Child158 extends Parent158{
    Child158(String city){
        super(city);
    }
}
