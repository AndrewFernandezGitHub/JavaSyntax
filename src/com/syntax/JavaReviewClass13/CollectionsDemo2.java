package com.syntax.JavaReviewClass13;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Andrew");
        names.add("Joe");
        names.add("Billy");
        names.add("Ace");
//names.remove(s->s.length()>5)
        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext()){
            if(iterator.next().length()>5){
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
