package com.syntax.JavaClass31;

import java.util.HashMap;
import java.util.Map;

//Create a Map that will store Employee name and salary. Write a logic to retrieve
// an employee who gets the highest salary. Output should be in the below format:
//John Smith=$100000
public class MapTask1 {
    public static void main(String[] args) {


        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("Andrew",100000);
        employee.put("Diego",110000);
        employee.put("Marcela",150000);
        employee.put("Alex",200000);


        String name = null;
        Integer salary = 0;
        for (Map.Entry<String, Integer> entry : employee.entrySet()) {
            if (entry.getValue() > salary) {
                salary = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(name+" =$ "+salary);
    }
}