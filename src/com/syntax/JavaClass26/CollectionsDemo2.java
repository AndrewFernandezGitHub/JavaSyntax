package com.syntax.JavaClass26;

import sun.lwawt.macosx.CSystemTray;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String>countries=new ArrayList<>();
        countries.add("USA");//index 0
        countries.add("Germany");//index 1
        countries.add("Italy");//index 2
        countries.add("Canada");//index 3
        countries.add("Mexico");//index 4
        System.out.println(countries.get(3));
       // System.out.println(countries.get(-1)); this will give an error, index outside of array
        System.out.println(countries.get(2));
        System.out.println(countries);
       // System.out.println(countries.get(5)); also out of bound, bigger than array size
        countries.add(3,"Croatia");//will add croatia to third index, push other elements up
        System.out.println(countries);
        countries.add("Yugoslavia");
        System.out.println(countries.size());//to get total length or size of array
       countries.remove("Croatia");//.clear will remove one element at a time
        System.out.println(countries);
        countries.clear();//clear will remove all the items in the element
        System.out.println(countries);
        System.out.println(countries.size());

    }
}
