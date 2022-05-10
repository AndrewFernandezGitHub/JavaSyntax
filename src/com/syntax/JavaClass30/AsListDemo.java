package com.syntax.JavaClass30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListDemo {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        int[] arr2=new int[5];
        arr2 [0]=10;
        arr2 [1]=20;
        arr2 [2]=30;
        //long way

//other way to make array
        List<Integer> list= Arrays.asList(10,20,30);//asList internally creates an array, which is fixed in size
        System.out.println(list);
        //not supported if we create arrays using Arrays.asList
       // list.add(40);// with asList approach, can not make changes to the array as arrays are
        //fixed in size


       List<Integer> list2= new ArrayList<>( Arrays.asList());
       list2.add(40);
        System.out.println(list2);//this way kinda wastes memory, creates two lists
        //one restricted list and then another unrestricted  list of the restricted list




    }
}
