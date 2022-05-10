package com.syntax.JavaClass28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Git");
        courses.add("Java");
        courses.add("Selenium");
        courses.add("Cucumber");
        courses.add("SQL");
        courses.add("Cucumber");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("Interview");
        courses.add("Resume");
        courses.add("AWS");
        courses.add("APM");
        courses.add("Docker");
        courses.add("Dead");
        System.out.println(courses);
        courses.set(courses.size()-1,"Happy");//replace by finding item
        // in specified indexx and replaces with new string using SET method
        System.out.println(courses);
    }
}
