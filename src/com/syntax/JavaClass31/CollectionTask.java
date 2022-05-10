package com.syntax.JavaClass31;

import java.util.LinkedHashSet;

//Create the collection that will store single unique Objects of a String type
// in which order is preserved.
//Write a logic to concatenate all string from the collection.
public class CollectionTask {
    public static void main(String[] args) {
        LinkedHashSet<String> drinks = new LinkedHashSet<>();
        drinks.add("Coke");
        drinks.add("Redd Bull");
        drinks.add("Shots");
        drinks.add("Water");
        drinks.add("Link");
        //concate the values
        StringBuilder allDrinks=new StringBuilder();

        for (String drink : drinks) {
            allDrinks.append(drink).append(" ");
        }
        System.out.println(allDrinks);

    }
}
