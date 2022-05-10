package com.syntax.JavaClass28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterationDemo3 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Git");
        courses.add("Java");
        courses.add("Selenium");
        courses.add("Cucumber");
        courses.add("SQL");

        Iterator<String> iterator=courses.iterator();
        while (iterator.hasNext()){//if iterator has a next method
            System.out.println(iterator.next());//then go to the next method
        }
    }
}