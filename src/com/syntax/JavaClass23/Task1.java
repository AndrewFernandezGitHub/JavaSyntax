package com.syntax.JavaClass23;
//Create a class named 'Programming'. While creating an object of the class, if
// nothing is passed to it, then the message "I love programming languages" should
// be printed. If some String is passed to it, then in place of "programming
// languages" the value variable should be printed. Example, if we pass "Java",
// then "I love Java" should be printed.
class Programming{
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String str){
        System.out.println("I love "+str);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Programming programming=new Programming();
        new Programming("Java");
        main("Andrew");
    }
    public static void main(String args) {
        Programming programming=new Programming();
        new Programming("Java");
    }}