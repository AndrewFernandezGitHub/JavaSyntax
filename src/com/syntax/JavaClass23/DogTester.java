package com.syntax.JavaClass23;

import javax.sound.midi.Soundbank;

public class DogTester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.print(dog);

        Dog dog2=new Dog("Tommy","Green","Bulldog",13,50);
        System.out.println(dog2);

        dog2.changeInfo("Bill");
        dog2.changeInfo("Bob","Hue");
    }
}
