package com.syntax.JavaClass17;
//variable examples
public class HealthyDog {
    //When the information is expected to be different from object to object
    //we store that information in an instance variable
    String name;//instance variable
    String color;//instance variable
    //if we know that a value will stay same for all the objects of a class
    //we create a static vairable for that why because
    static int numberOfLegs;//static variable
    void eat (){
        int noOfTimes=3;//local
        System.out.println(name+" eats "+ noOfTimes);
    }
    void sleep(){
      //  System.out.println(name+" Sleeping"+noOfTimes);//noOfTImes is not local to this
    }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog();//local variable

        dog.name="scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="Bo";
        dog2.color="Navy Blue";
        HealthyDog.numberOfLegs=4;
        dog2.eat();


    }
}
