package com.syntax.JavaClass18;

public class AccessModifierTester {
    public static void main(String[] args) {
        AccessModifier am=new AccessModifier();
        //System.out.println(am.name);//in Access Modifier, the name variable is a protected variable in a different class
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }
}
