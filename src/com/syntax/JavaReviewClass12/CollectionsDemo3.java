package com.syntax.JavaReviewClass12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Andrew");
        arrayList.add("Marcela");
        arrayList.add("Bob");
        arrayList.add("Joe");
        arrayList.add("Jill");
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Andrew"));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        char[] arr = "Andrew1".toCharArray();
        System.out.println(arr[2]);
        System.out.println(Character.isAlphabetic('B'));

        char c = ']';
        System.out.println(Character.isAlphabetic(c));
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isLetter(c));

    }
}
