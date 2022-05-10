package com.syntax.Replits;

import java.util.ArrayList;

public class Replit185List {
    public static void main(String[] args) {
        ArrayList<Integer> myArraylist=new ArrayList<>();
        myArraylist.add(111);
        myArraylist.add(111);
        myArraylist.add(111);
        myArraylist.add(999);
        myArraylist.add(999);
        myArraylist.add(999);

        /*System.out.println(myArraylist.get(0));
        System.out.println(myArraylist.get(1));
        System.out.println(myArraylist.get(2));
        System.out.println(myArraylist.get(3));
        System.out.println(myArraylist.get(4));
        System.out.println(myArraylist.get(5));

         */
        //use loop below to print this sout above

        for(Integer number:myArraylist){
            System.out.println(number);//easy way to use advanced loop to print index items
            //1 by 1


        }
    }
}
