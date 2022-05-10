package com.syntax.JavaClass28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask1 {
    /*create an arraylist of cars and retrieve all the values using 3 different ways
     */
    public static void main(String[] args) {

        /*ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
         */
       /* ArrayList<String> cars=new ArrayList<>(Arrays.asList("BMW","Audi","Porsche"));
        cars.remove("BMW");
       this method above will be discussed why not to be used
        */

        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Porsche");
        System.out.println(cars);
        for (String car:cars){
            System.out.println(car);
        }
        for (int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        int i=0;
        while (i<cars.size()){
            System.out.println(cars.get(i));
            i++;
        }
        Iterator<String> iterator=cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
