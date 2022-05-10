package com.syntax.JavaClass17;

import com.syntax.JavaClass18.AccessModifier;

public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifier am=new AccessModifier();
        //System.out.println(am.name);//in Access Modifier, the name variable is a protected variable in a different class
        //System.out.println(am.age); cant access age because it has default access(in other package/class)
        //System.out.println(am.weight); cant access weight because it has protected access in other package/class
        System.out.println(am.color);//can access color because it has access from anywhere as public within the same project
    }
}
