package com.syntax.JavaClass30;
//entrySet demo
// each entry in the set has both a Key and Value container inside the individual Entry container
import java.util.HashMap;
import java.util.Map;

//entrySet is new method that returns an object of Map as single  entity(both key and value)
public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.50);
        fruitMap.put("Mango", 20.2);
        System.out.println(fruitMap.entrySet());
        //notice how it prints the name and the number(key and value) together
        for (Map.Entry<String,Double> entry: fruitMap.entrySet()){//how to get the key and value inside entry container
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry);

        }
    }
}