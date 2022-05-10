package com.syntax.JavaClass28;

import java.util.HashSet;
import java.util.LinkedHashSet;
//Linked Hash Set stores in order but does not remove duplicate
public class SetDemo2 {
    public static void main(String[] args) {
            LinkedHashSet<String> fruit=new LinkedHashSet<>();
            fruit.add("Apple");
            fruit.add("Orange");
            fruit.add("Banana");
            fruit.add("Apple");
            fruit.add("Kiwi");
            fruit.add("Mango");
            System.out.println(fruit);


        }
    }

