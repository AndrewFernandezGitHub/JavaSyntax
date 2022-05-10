package com.syntax.Replits;

public class Replit164MethodOverriding {
    public static void main(String[] args) {
        Child1R164 obj1=new Child1R164();
        Child2R164 obj2=new Child2R164();
        Child3R164 obj3=new Child3R164();

        ParentR164 [] objectArr={obj1,obj2,obj3};
        for (ParentR164 i:objectArr){
            i.hello();
        }
    }
}
class ParentR164{
    void hello(){
        System.out.println("Method in parent class");
    }
}
class Child1R164 extends ParentR164{
    void hello(){
        System.out.println("Method in child1 class");
    }
}
class Child2R164 extends Child1R164{
    void hello(){
        System.out.println("Method in child 2 class");
    }
}
class Child3R164 extends Child2R164{
    void hello(){
        System.out.println("Method in child 3 class");
    }
}
