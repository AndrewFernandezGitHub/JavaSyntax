package com.syntax.Replits;
/*
Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following
values and then print them.
carColor='Black'
carYear=2019
carMake='BMW'
carColor='White'
carYear=2018
carMake='Toyota'
Expected Output:
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
 */
public class Replit87 { String carColor;
    int carYear;
    String carMake;
    public static void main (String [] args){

        Replit87 obj1=new Replit87();
        obj1.carColor="Black";
        obj1.carYear=2019;
        obj1.carMake="BMW";
        System.out.println("Car color is "+obj1.carColor+" and car year is "+obj1.carYear+" and car model is "+obj1.carMake);

        Replit87 obj2 =new Replit87();
        obj2.carColor="White";
        obj2.carYear=2018;
        obj2.carMake="Toyota";
        System.out.println("Car color is "+obj2.carColor+" and car year is "+obj2.carYear+" and car model is "+obj2.carMake);



    }


}
