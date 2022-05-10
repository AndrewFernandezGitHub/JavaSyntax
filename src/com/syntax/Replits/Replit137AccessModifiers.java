package com.syntax.Replits;

/*For you to do

        In main class please declared the variables using different access modifiers that will hold value for:

        name
        city
        name of the school
        batch number
        Create a method to display details in following format:

        My name is ___ and I live in ___. I study at ___ in batch ___

        Assign values to the variables and execute method display

        Expected Output:

        My name is John and I live in Miami. I study at Syntax in batch 9

 */
public class Replit137AccessModifiers {
    private String name;
    protected String city;
    String nameOfTheSchool;
    public String batchNumber;

    Replit137AccessModifiers(String name, String city, String nameOfTheSchool, String batchNumber) {
        this.name = name;
        this.city = city;
        this.nameOfTheSchool = nameOfTheSchool;
        this.batchNumber = batchNumber;
    }

    void display() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + nameOfTheSchool + " in batch "+batchNumber);
    }

    public static void main(String[] args) {


        Replit137AccessModifiers obj = new Replit137AccessModifiers("Andrew", "Alexandria", "Syntax", "12");
        obj.display();

    }
}