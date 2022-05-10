package com.syntax.JavaClass25;

import javax.crypto.spec.PSource;

public interface Human {
    //public static final redundant. By default all variables are public static and final
    //public static final int legs=2;
    int legs = 2;

    // public abstract void walk(); public and abstract are redundant
    void walk();

    static void printLegs() {
        System.out.println(legs);
    }
    public default void noNeedToWorry(){
        System.out.println("default methods are there to functional programming");
    }
}
interface  LivingBeing{
    static void printLegs(){
        System.out.println("not sure");
    }
}
class Andrew implements Human,LivingBeing{
    @Override
    public void walk(){
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        Andrew andrew=new Andrew();
        andrew.walk();
        andrew.noNeedToWorry();
        //Andrew.printLegs();
        Human.printLegs();
        LivingBeing.printLegs();
    }
}