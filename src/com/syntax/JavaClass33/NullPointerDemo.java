package com.syntax.JavaClass33;

import com.syntax.JavaClass23.Dog;

//this is very famous interview question about null point exception
public class NullPointerDemo {
    public static void main(String[] args) {
        String str=null;
        //we get null pointer exception when a method is call on an object which is
        //not initialized
        //str.length();
        Dog dog=null;
        //dog.toString();

    }
}
