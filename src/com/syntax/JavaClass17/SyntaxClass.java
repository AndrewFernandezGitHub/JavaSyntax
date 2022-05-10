package com.syntax.JavaClass17;

public class SyntaxClass {
    double salary;
    static String CEO="Sumair";
    String empId;

    public static void main(String[] args) {
        SyntaxClass andrew=new SyntaxClass();
        andrew.empId="123";
        andrew.salary=200000;
        System.out.println(andrew.empId);
        System.out.println(andrew.salary);
        System.out.println(SyntaxClass.CEO);

        SyntaxClass marcela=new SyntaxClass();
        marcela.empId="234";
        marcela.salary=130000;
        System.out.println(marcela.empId);
        System.out.println(marcela.salary);
        System.out.println(SyntaxClass.CEO);


    }
}
