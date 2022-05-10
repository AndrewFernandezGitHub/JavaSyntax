package com.syntax.JavaClass26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name="Andrew";
        //String name2="Marcela";
        //not scalable if we have to store large amount of data
        //Arrays can be a good option to tackle this problem

        String[] names={"Andrew","Marcela"};
        //names[2]="Bob";
        String[]names2=new String[1000];
        names2[0]="Joe";
        names2[2]="Andrew";
        System.out.println(Arrays.toString(names2));
        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList=Name of the class
        //<> diamond operator
        //String datatype
        syntaxStudents.add("Billy");
        syntaxStudents.add("Bo");
        syntaxStudents.add("Jim");
       // syntaxStudents.add("Able","Kim","John");
        System.out.println(syntaxStudents);
    }
}
