package com.syntax.JavaClass23;

public class StaticDemo {
}

class Cat{
    static int NoOfLegs=4;
    String name;
    Cat (String name){
        this.name=name;
    }
    public void printINfo(){
        System.out.println(name+NoOfLegs    );
    }
    public static void Print(){
        //we can't access the instance fields directly inside the static methods
       // System.out.println(name+NoOfLegs); name wont work in this instance
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");
Cat.Print();
        Cat cat2=new Cat("Marcela");
        Cat.Print();
    }
}
