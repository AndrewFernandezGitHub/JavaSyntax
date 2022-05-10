package com.syntax.Replits;

public interface Replit175Interface {
}

interface FirstInterface {
    void firstMethod();
}

interface SecondInterface {
    void secondMethod();
}

class R175Interface implements FirstInterface, SecondInterface {
    public void firstMethod() {
        System.out.println("First Method implementing multiple inheritance");
    }

    public void secondMethod() {
        System.out.println("Second Method implementing multiple inheritance");
    }

    public static void main(String[] args) {
        R175Interface obj = new R175Interface();
        obj.firstMethod();
        obj.secondMethod();
    }
}