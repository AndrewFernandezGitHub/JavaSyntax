package com.syntax.JavaClass28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
    courses.add("SDLC");
        courses.add("Manuel Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");

      /*  for (int i=0;i<courses.size();i++){
            if(courses.get(i).equals("Java")){
                courses.remove("Java");
            }
        }

       */
        for(String course:courses){
            if (course.equals("Java")){
                courses.remove(course);
            }
        }
    }
}