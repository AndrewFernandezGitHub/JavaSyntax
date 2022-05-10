package com.syntax.Replits;
//In this class, you should specify the following attributes: breed, name, color, and
        //following behaviors: bark(), run(), play().
        //Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes
       // and behaviors.
public class Replit88 {
    String breed,name,color;

    void bark(){
        System.out.println(breed+" can bark");
    }
    void run(){
        System.out.println(breed+" can run");
    }
    void play(){
        System.out.println(breed+" can play");
    }

    public static void main(String[] args) {
        Replit88 husky=new Replit88();
        husky.breed="Husky";
        Replit88 bulldog=new Replit88();
        bulldog.breed="Bulldog";
        Replit88 labrador=new Replit88();
        labrador.breed="Labrador";


        husky.bark();
        husky.run();
        husky.play();
        bulldog.bark();
        bulldog.run();
        bulldog.play();
        labrador.bark();
        labrador.run();
        labrador.play();
    }

}
