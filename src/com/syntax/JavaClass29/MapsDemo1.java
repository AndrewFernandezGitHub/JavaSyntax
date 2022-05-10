package com.syntax.JavaClass29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(12345678,"Andrew Fernandez");//associate any key with any value
        map.put(123456,"Bobmos");
        System.out.println(map.get(12345678));
        System.out.println(map.get(123456));

        ArrayList<String> names=new ArrayList<>();
        names.add("Andrew Fernandez");
        names.add("Marcela");
        System.out.println(names.get(0));

        HashMap<String,String> groceries =new HashMap<>();
        groceries.put("Lili","eggs,milk,Bread");
        groceries.put("Andrew","Camel,Horse,CamelHorse etc");
        groceries.put("Ashhat","Macbook,1000s");
        System.out.println(groceries);
    }
}
