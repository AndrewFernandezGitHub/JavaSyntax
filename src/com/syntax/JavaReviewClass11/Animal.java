package com.syntax.JavaReviewClass11;

public class Animal {
    String name;
    String color;
    void Sleep(){
        System.out.println("I am sleeping");
    }
}
class Dog extends Animal{
    void Sleep(){
        System.out.println("Dog sleeps in the day");
    }
}
class Cat extends Animal{
    void Sleep(){
        System.out.println("Cat sleeps all day");
    }
    void eat(){
        System.out.println("Cat likes to eat");
    }
}class Test2 {
    public static void main(String[] args) {
        //Cat cat=new Dog() not possible
        //Cat cat-new Animal();down casting
        Animal animal = new Cat();//upcasting
        animal.Sleep();
        //animal.eat();//error because eat is in cat class not parent Animal class
        //we cant use methods that are specific to cat class only because right now it is behaving as an animal
        //Dog dog=(Dog)animal;
        //dog.Sleep();
        method(new Dog());
        method(new Cat());
    }

    public static void method(Animal animal) {
        if (animal instanceof Cat) {
            ((Cat) animal).eat();
        } else {
            System.out.println("you are not passing a cat inside the box animals");
        }


    }
}
