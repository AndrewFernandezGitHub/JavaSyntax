package com.syntax.JavaClass30;

import java.util.HashMap;
import java.util.Iterator;

//autocasting does not work for collections and sets 20->20.0
public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.50);
        fruitMap.put("Mango", 20.2);
        System.out.println(fruitMap);
        //Iterators need a set or collection first before they can be used

        //fruitMap.keySet();//gives us the key set, a set containing all they keys
        Iterator<String> iterator= fruitMap.keySet().iterator();//creates Iterator after calling set
//getting iterator from the map with the help of method chaining^
        while(iterator.hasNext()){
            String key= iterator.next();
            Double value=fruitMap.get(key);//getting corresponding values from map by passing they keys
            if(key.contains("e")&& value>=20){
                iterator.remove();//if both conditions are satisfied, we remove the element from the map
            }
        }
        System.out.println(fruitMap);

    }
}
