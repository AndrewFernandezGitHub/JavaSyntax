package com.syntax.JavaClass29;

import java.util.Iterator;
import java.util.LinkedHashSet;

//create a Set of cities in which you want to make sure that insertion
//order is maintained. Then remove any city that starts with "A";
public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Los Angeles");
        cities.add("San Francisco");
        cities.add("New York");
        cities.add("Miami");
        cities.add("Atlanta");
        cities.add("Walnut Creek");
        cities.add("Arlington");
        cities.add("Oakland");
        cities.add("Boston");
        System.out.println(cities);


        cities.removeIf(x ->x.startsWith("A"));//solved with lambda
       // Iterator<String> iterator=cities.iterator();
       // while (iterator.hasNext()){
//solved with lambda        //    if(iterator.next().startsWith("A")){
        //        iterator.remove();
        //    }
       // }
    }
}
