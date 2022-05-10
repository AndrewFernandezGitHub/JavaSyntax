package com.syntax.JavaClass30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {
    public static void main(String[] args) {
            HashMap<String,Double> fruitMap=new HashMap<>();
            fruitMap.put("Apple",20.0);
            fruitMap.put("Banana",10.2);
            fruitMap.put("Kiwi",105.2);
            fruitMap.put("Orange",16.50);
            fruitMap.put("Mango",20.2);

        Collection<Double> values =fruitMap.values();
        System.out.println(values);

        Iterator<Double> iterator=values.iterator();
        while (iterator.hasNext()){
            if(iterator.next()>=20){//gets all values one by one from map and compares values to number 20, if greater than they will be removed
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
    }
}
