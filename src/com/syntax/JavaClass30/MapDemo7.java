package com.syntax.JavaClass30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.50);
        fruitMap.put("Mango", 10.2);

        Iterator<Map.Entry<String, Double>> iterator = fruitMap.entrySet().iterator();

        while (iterator.hasNext()) {
            //getting the entries from Iterator
            Map.Entry<String, Double> entry = iterator.next();//retrieves entry from set one by one once identified by .hasNext in loop
            //getting the keys and values from the entry Object
            if (entry.getKey().endsWith("e") || entry.getValue() >= 20) {
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
    }
}
