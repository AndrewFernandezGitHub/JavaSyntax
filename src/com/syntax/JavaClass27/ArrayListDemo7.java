package com.syntax.JavaClass27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(1,100);

        LinkedList<Integer> linkList=new LinkedList<>();
        linkList.add(10);
        linkList.add(12);
       linkList.add(20);
       linkList.add(40);
        linkList.add(50);
        linkList.add(1,100);
    }
}
