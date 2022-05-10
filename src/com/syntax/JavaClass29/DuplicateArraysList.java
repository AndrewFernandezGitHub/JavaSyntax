package com.syntax.JavaClass29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
//how can you remove duplicates from array list
public class DuplicateArraysList {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Janes");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("Jame");
        LinkedHashSet linkedHashSet=new LinkedHashSet<>(aList);aList.clear();
        aList.addAll(linkedHashSet);
        System.out.println(aList);
    }
}
