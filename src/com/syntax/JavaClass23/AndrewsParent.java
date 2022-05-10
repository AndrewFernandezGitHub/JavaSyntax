package com.syntax.JavaClass23;

public class AndrewsParent {
    String girlName="Marcela";
    double money=10000000;
    void marry(){
        System.out.println("Andrew should marry "+ girlName);
    }
}
class Andrew extends AndrewsParent{
    String girlName="Vanessa Hudgens";
    void marry(){
        super.marry();
        System.out.println("But andrew also wants to have fun with "+girlName);

    }
}
