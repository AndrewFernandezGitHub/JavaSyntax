package com.syntax.JavaReviewClass09;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Andrew","Fernandez","Surgeon");
        System.out.println(doc.firstName);
       Doctor doc1=new Doctor("Marcela","Martinez");
       doc1.printInfo();
        System.out.println("Change vale of instance variable");
        doc1.specialty="dermatologist";
        doc1.printInfo();

        System.out.println("changing value of static variable");
        Doctor.hospital="Inova";
        doc.printInfo();
        doc1.printInfo();
        System.out.println("-------------");
        doc1.hospital="Best hospital";
        doc.printInfo();
        doc1.printInfo();

/*public method available
default method available
protected method available
private method not available is not available in a different class

if clas is coming from another package, you have to import it for some access modifiers
such as public,
default method not available in different package
protected method not available in different package
private method is not available in different classes
public method available everywhere
cant add non access modifiers
 */

    }
}
