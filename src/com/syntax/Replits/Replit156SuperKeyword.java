package com.syntax.Replits;

public class Replit156SuperKeyword {
}

class R156Super {
    public static void main(String[] args) {
        B156 obj = new B156();
        obj.display();
    }
}

class A156 {
    int i = 10;
}

class B156 extends A156 {
    int i = 20;

    public void display() {
        System.out.println(this.i);
        System.out.println(super.i);
    }
}
