package com.syntax.JavaReviewClass09;

public class Doctor {

    /*instance variables - declared inside the class but outside any method, constructor
    or block
     */
    String firstName, lastName, specialty;

    /*static variable - declared inside the class but outside any method, constructor,
    or block of code//using static keyword
     */
    static String hospital = "VHC";

    //static methods can access only static members
  protected  static void work() {
        System.out.println("All doctors work at " + hospital);
    }
    //static can only work with static members

    //static method cannot access non-static members
  public  void printInfo() {
        System.out.println("Doctor " + firstName + lastName + " is a " + specialty);
    }
    void hello(){
        System.out.println("Hello");
    }

    //constructor-initializing instance variables
    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //we can have multiple constructors by overloading them
    Doctor(String firstName, String lastName, String specialty) {
        this(firstName, lastName);
        // this.firstName=firstName;
        //this.lastName=lastName;
        this.specialty = specialty;
        System.out.println("Hello" + firstName);
    }

    //non-static methods can access static members
    void work1() {
        System.out.println("All doctors work at " + hospital);
    }

}
/*VARIABLES
optional        optional            must    must
accessModifier nonAccessModifier dataType name;

METHODS
optional       optional                  must        must
accessModifier    nonAccesModifier      returnType  name()

//from most restrictive to less restrictive access modifiers
private->default->protected->public


 */