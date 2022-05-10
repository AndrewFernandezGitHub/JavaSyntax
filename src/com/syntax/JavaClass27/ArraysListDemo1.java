package com.syntax.JavaClass27;
//assign the values and conversion will be done automatically
import java.util.ArrayList;
//notice Double with upper case,
public class ArraysListDemo1 {
    public static void main(String[] args) {
        ArrayList <Double> numberList=new ArrayList<>();
        Double double1=new Double(10.5);
        double number=double1.doubleValue();//deboxing
        Double number2=new Double(number);//boxing
        double number3=10.7;//autoboxing
        Double number4=number3;//autoboxing
        number3=number4;//autounboxing

        String name=new String("hakan");
        String name3="Hakan";

        //converting to primitive is boxing
// converting from wrapper to primitive is unboxing
    }
}
