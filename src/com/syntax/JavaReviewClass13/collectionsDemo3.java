package com.syntax.JavaReviewClass13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class collectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Andrew");
        names.add("Joe");
        names.add("Billy");
        names.add("Ace");

       ListIterator<String> stringListIterator= names.listIterator();
       while(stringListIterator.hasNext()){
           String name=stringListIterator.next();
           stringListIterator.add("Crazy lady");
           System.out.println(name);

       }
    }
}

