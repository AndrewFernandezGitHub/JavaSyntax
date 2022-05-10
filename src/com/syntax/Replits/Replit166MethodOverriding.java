package com.syntax.Replits;

public class Replit166MethodOverriding {
    public static void main(String[] args) {
        AnimalR166 obj=new AnimalR166("Cat");
        kitten1 obj1=new kitten1("kitten1");
        kitten2 obj2=new kitten2("kitten2");
        kitten3 obj3=new kitten3("kitten3");
        obj.eat();
        obj.sleep();
        obj1.eat();
        obj1.sleep();
        obj2.eat();
        obj2.sleep();
        obj3.eat();
        obj3.sleep();
    }
}
class AnimalR166{
    String type;
    AnimalR166 (String type){
        this.type=type;
    }
    void eat(){
        System.out.println(type+" eats");
    }
    void sleep(){
        System.out.println(type+" sleeps a lot");
    }
}
class kitten1 extends AnimalR166{

    kitten1(String type) {
        super(type);
    }
    void eat(){
        System.out.println(type+" eats milk");
    }
}
class kitten2 extends kitten1{

    kitten2(String type) {
        super(type);
    }
    void eat(){
        System.out.println(type+" eats snacks");
    }
}
class kitten3 extends kitten2 {
    kitten3(String type) {
        super(type);
    }
    void eat(){
        System.out.println(type+" eats everything");
    }
}
