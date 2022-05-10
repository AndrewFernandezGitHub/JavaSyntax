package com.syntax.JavaReviewClass13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<LinkedList<String>> complexData=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Andrew is cool");
        linkedList.add("Asghar is cool");
        linkedList.add("You is cool");

        LinkedList<String> linkedList1=new LinkedList<>();
        linkedList1.add("Bob");
        linkedList1.add("joe");
        linkedList1.add("godzilla");
        complexData.add(linkedList);
        complexData.add(linkedList1);
        System.out.println(complexData);
    }
}
