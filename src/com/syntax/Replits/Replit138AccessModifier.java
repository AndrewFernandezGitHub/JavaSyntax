package com.syntax.Replits;

public class Replit138AccessModifier {
    private String firstMethod1(){
        final String isPrivate="private";
        return isPrivate;
    }
    String secondMethod2(){
        final String isDefault="default";
        return isDefault;
    }
    protected String thirdMethod3(){
        final String isProtected="protected";
        return isProtected;
    }
    public String fourthMethod4(){
        final String isPublic="public";
        return isPublic;
    }
}
class Main {
    public static void main(String[] args) {
        Replit138AccessModifier obj=new Replit138AccessModifier();
        obj.secondMethod2();
        obj.thirdMethod3();
        obj.fourthMethod4();
    }
}
