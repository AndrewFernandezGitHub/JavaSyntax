package com.syntax.JavaClass30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.50);
        fruitMap.put("Mango", 20.2);
        System.out.println(fruitMap.keySet());//prints all they keys
        System.out.println(fruitMap.values());//prints only the values
        System.out.println(fruitMap.entrySet());//prints keys+values together

        //getting keys and values in the form of an entry
        Iterator<Map.Entry<String,Double>> iterator=fruitMap.entrySet().iterator();
        while(iterator.hasNext()){//checks if iterator has a next value, if it does iterator.next holds tht value
            //System.out.println(iterator.next());//all; values combined if printed liked this
            System.out.println(iterator.next().getValue());
            //entrySet gives you versatility

        }


    }
}
