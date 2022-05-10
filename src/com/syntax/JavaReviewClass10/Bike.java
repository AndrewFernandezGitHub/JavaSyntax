package com.syntax.JavaReviewClass10;

public class Bike {
    int maxSpeed=100;
    int engineCC=155;
    void printMaxSpeed(){
        System.out.println(maxSpeed);
    }
    void printEngineCC(){
        System.out.println(engineCC);
    }
}
class HondaBikes extends Bike{
    int maxSpeed=150;
    int engineCC=125;
    void printEngineCC(){
        System.out.println(engineCC);
    }
    void printMaxSpeed(){
        int maxSpeed=200;
        System.out.println(super.maxSpeed);
        System.out.println(maxSpeed);
        System.out.println(this.maxSpeed);
    }
    void printInfoFromParentAndChild(){
        printEngineCC();
        this.printEngineCC();
        super.printEngineCC();

    }
}
class Test234{
    public static void main(String[] args) {
        HondaBikes hondaBikes=new HondaBikes();
        //hondaBikes.printMaxSpeed();
        hondaBikes.printInfoFromParentAndChild();//java prefers local things if no super/this keywords present

    }
}