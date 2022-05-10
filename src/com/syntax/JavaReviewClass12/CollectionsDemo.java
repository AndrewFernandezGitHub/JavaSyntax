package com.syntax.JavaReviewClass12;

import com.syntax.Util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo {
    public static void main(String[] args) {
        String[] names=new String[100];
        names[0]="Andrew";
        System.out.println(Arrays.toString(names));

        //ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(names));
        ArrayList<String> arrayList= ArrayUtil.toArrayList(names);//used util class instead of above line to shorten it

        arrayList.add("Marcela");
        System.out.println(arrayList);
    }
}
