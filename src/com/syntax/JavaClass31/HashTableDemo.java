package com.syntax.JavaClass31;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,String> students=new Hashtable<>();
        students.put("1","Andrew");
        students.put("2","Marcela");
        students.put("3","Bob");

        Set<Map.Entry<String,String>> entrySet=students.entrySet();
        for (Map.Entry<String,String> entry:entrySet){
            System.out.println(entry);
        }

    }
}
