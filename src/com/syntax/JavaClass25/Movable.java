package com.syntax.JavaClass25;

public interface Movable {
    void move();
}
interface DriveAble{
    void drive();
}
interface Car extends DriveAble,Movable{

}
class BMW implements Car{

    @Override
    public void move() {
        System.out.println("We can move the BMW");
    }

    @Override
    public void drive() {
        System.out.println("We can drive the BMW");
    }
}