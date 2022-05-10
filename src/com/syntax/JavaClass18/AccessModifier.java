package com.syntax.JavaClass18;

public class AccessModifier {
    private String name="Naughty  Andrew";
    int age=31;
    protected double weight=181;
    public String color="Blue";

    public static void main(String[] args) {
        AccessModifier am=new AccessModifier();
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }

}
