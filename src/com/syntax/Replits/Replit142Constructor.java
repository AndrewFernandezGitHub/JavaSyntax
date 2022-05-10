package com.syntax.Replits;

public class Replit142Constructor {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    Replit142Constructor() {
        schoolName = null;
        batch = 0;
        year = 0;
        lastDayOfClass = null;
    }

    Replit142Constructor(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }


    public static void main(String[] args) {
        Replit142Constructor obj1 = new Replit142Constructor();
        Replit142Constructor obj2 = new Replit142Constructor("Syntax",6,2020,"07/30/2020");
        obj1.display();
        obj2.display();
    }
}