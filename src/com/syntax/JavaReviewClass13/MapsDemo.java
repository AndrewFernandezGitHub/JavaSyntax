package com.syntax.JavaReviewClass13;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> personInfo=new HashMap<>();
        personInfo.put(11111,"Andrew");
        personInfo.put(2222,"Marcela");
        personInfo.put(33333,"Aurora");
        personInfo.put(44444,"Bill");

        for (Map.Entry<Integer,String>entry: personInfo.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
