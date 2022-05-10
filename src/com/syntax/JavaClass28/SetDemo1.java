package com.syntax.JavaClass28;

import java.util.HashSet;
// not duplicates allowed in Sets and the printout will not be
// in same order as written
//no insertion order
//Hash Set
public class SetDemo1 {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();//HashSet does not allow duplicate variables
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Mango");
        System.out.println(fruit);


    }
}
