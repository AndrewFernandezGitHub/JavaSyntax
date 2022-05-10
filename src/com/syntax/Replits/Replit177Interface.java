package com.syntax.Replits;

public interface Replit177Interface {
}
interface iOutputs{
    void display(double myResult);
}
interface iFunctions extends iOutputs{
    double adding(double firstNumber, double secondNumber);
    double subtracting(double firstNumber,double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double dividing(double firstNumber,double secondNumber);
}
class R177 implements iFunctions{
    @Override
    public void display(double myResult) {
        System.out.println("Result is ::: "+myResult);
    }

    @Override
    public double adding(double firstNumber, double secondNumber) {
        return (firstNumber+secondNumber);
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        return (firstNumber-secondNumber);
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return(firstNumber*secondNumber);
    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        return (firstNumber / secondNumber);
    }

    public static void main(String[] args) {
        R177 obj=new R177();
        obj.display(obj.adding(100.00,20.00));
        obj.display(obj.subtracting(100.00,20.00));
        obj.display(obj.multiply(100.00,20.00));
        obj.display(obj.dividing(100.00,20.00));
    }
}
