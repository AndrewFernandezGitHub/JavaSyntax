package com.syntax.Replits;

public class Replit182Encapsulation {
}
class Person182{
    private String firstName;
    private String lastName;
    private String ssn;
    private int birthDay;
    private int birthYear;
    private int birthMonth;

    Person182(String firstName,String lastName, String ssn, int birthMonth, int birthDay, int birthYear){
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn=ssn;
        this.birthDay=birthDay;
        this.birthYear=birthYear;
        this.birthMonth=birthMonth;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSsn(){
        return this.ssn;
    }
    public int getBirthDay(){
        return this.birthDay;
    }
    public int getBirthMonth(){
        return this.birthMonth;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public String FormatBirthday(){
        return getBirthMonth() + "/"+ getBirthDay()+"/"+ getBirthYear();
    }
}
class R182Main{
    public static void main(String[] args) {
        Person182 person=new Person182("John","Doe","123-45-6789",10,25,1900);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.FormatBirthday());
        System.out.println(person.getSsn());
    }
}