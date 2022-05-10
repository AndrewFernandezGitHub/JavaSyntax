package com.syntax.JavaClass27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(fruits);//adds all items in fruits
        groceries.addAll(vegetables);//adds all items in vegetables
        System.out.println(groceries);//prints all the items from fruit ands vegetables inside groceries

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");//dictating which items you want removed
        itemsToBeRemoved.add("Onion");

        groceries.removeAll(itemsToBeRemoved);//all items in items to be removed get removed from the groceries
        System.out.println(groceries);

    }
}
