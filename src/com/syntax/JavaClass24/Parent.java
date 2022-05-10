package com.syntax.JavaClass24;
//final keyword is used to not have methods or class be overridden or extended
public class  Parent {
    final String name="Andrew";
    final void method(){
        //cant reassign if a variable is final
        System.out.println("I am parent");
    }
}
class Child extends Parent{
    /*void method(){
    can't override because it is final method
     */

}