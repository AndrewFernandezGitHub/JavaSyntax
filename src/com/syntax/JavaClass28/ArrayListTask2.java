package com.syntax.JavaClass28;


import java.util.ArrayList;
import java.util.Iterator;

/*create an arrayList of words. Remove every word that ends with "e"
as we are making a change to the items in arrraylist, loops cant be used
 */
public class ArrayListTask2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Love");
        arrayList.add("lahore");
        arrayList.add("cake");

        // arrayList.removeIf(s -> s.toLowerCase().endsWith("e"));

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);

    }
}
        //same code below can be simplified with lambda --> arrayList.removeIf(s -> s.toLowerCase().endsWith("e"));
