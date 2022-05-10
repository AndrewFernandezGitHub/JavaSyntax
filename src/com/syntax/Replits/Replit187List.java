package com.syntax.Replits;

import java.util.ArrayList;

public class Replit187List {
    public static void main(String[] args) {
        ArrayList<String> myArrayList=new ArrayList<>();
        myArrayList.add("hi");
        myArrayList.add("yo");
        myArrayList.add("sup");
        myArrayList.add("yolo");
        myArrayList.add("boop");
        myArrayList.remove(0);
        myArrayList.remove(1);
        myArrayList.remove(2);
        for(String elements:myArrayList){
            System.out.print(elements+" ");
        }
    }
}
