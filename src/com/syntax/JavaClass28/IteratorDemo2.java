package com.syntax.JavaClass28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Git");
        courses.add("Java");
        courses.add("Selenium");
        courses.add("Cucumber");
        courses.add("SQL");

        courses.iterator();//will give you the iterator, and can now create variable to hold iterator

        //only call next method if hasNext method returns as true
        //once hasnext method is false, we have run out of items to check
        Iterator<String> iterator= courses.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
    }
    }

