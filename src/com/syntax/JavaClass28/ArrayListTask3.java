package com.syntax.JavaClass28;

import java.util.ArrayList;
/*Create an arrayList of drinks.
If any drink has letter “a” or “e” replace it with water.
 */
public class ArrayListTask3 {
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("Aloevera");

        for (int i=0;i<drinks.size();i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
