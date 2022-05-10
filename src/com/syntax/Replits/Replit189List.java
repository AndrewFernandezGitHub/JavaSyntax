package com.syntax.Replits;

import java.util.Iterator;
import java.util.LinkedList;

public class Replit189List {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=50;i<=100;i++){
            list.add(i);
        }
        //list.removeIf(num->num%3!=0); this is best practice method as shorter code and run time,uses lambda
        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext()){
            Integer next= iterator.next();
            if(next%3!=0){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
