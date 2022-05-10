package com.syntax.Replits;

/*Create super class Tea
include instance variable teaType
constructor that will initialize
unimplemented method addSugar()
Create 2 subclasses of Tea as Lemon Tea nd Chai Tea
in mai class create object of the child class Lemon Tea and Chai Tea
 */
public class Replit173Abstraction {

}

abstract class Tea {
    String teaType;

    Tea(String teaType) {
        this.teaType = teaType;
    }

    abstract void addSugar();
}

class LemonTea extends Tea {
    LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For " + teaType + " we need 2 spoons of sugar");
    }
}

class ChaiTea extends Tea {
    ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For " + teaType + " we need 1 spoons of sugar");
    }
}
class TeaTester{
    public static void main(String[] args) {
        Tea obj1=new LemonTea("Lemon Tea");
        Tea obj2=new ChaiTea("Chai Tea");
        obj1.addSugar();
        obj2.addSugar();
    }
}