package com.syntax.JavaClass30;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//Create a map of a building. Store floor number and it is associated company name.
// (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map
public class Task1 {
    public static void main(String[] args) {

        //integer goes first because it is by floor then company
        HashMap<Integer,String> buildings=new HashMap<>();
        buildings.put(1,"Google");
        buildings.put(2,"Apple");
        buildings.put(3,"Tesla");
        buildings.put(1,"Amazon");

        //List<String> list=new LinkedList<>();
        //list.addFirst("Anton");
        buildings.put(5,"Amazon");
        buildings.put(4,"Syntax");
        buildings.put(7,"Multiverse");
        System.out.println(buildings.size());
        System.out.println(buildings);
        buildings.replace(4,"Facebook");//update the value by replacing key
        System.out.println(buildings);
        buildings.remove(7);
        System.out.println(buildings);


    }
}
