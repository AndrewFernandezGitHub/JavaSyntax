package com.syntax.JavaReviewClass13;

import java.util.ArrayList;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Andrew");
        names.add("Joe");
        names.add("Billy");
        names.add("Ace");
        names.add("Marcela");
        long Y=names.parallelStream().filter(x->x.contains("l")).count();
       long m=names.stream().filter(x->x.contains("M")).count();
        System.out.println(m);
        System.out.println(Y);
    }
}
