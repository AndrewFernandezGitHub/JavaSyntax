package com.syntax.Replits;

import java.util.Arrays;

//Create final method avgElements that will average all the elements in an integer array
// (passed to the method as a parameter) and return the average.
public class Replit169FinalKeyword {
    public static void main(String[] args) {
        int[] a = {2, 7, 3, 8, 4};
        System.out.println(new Replit169FinalKeyword().avgElements(a));//should print 4.8
    }

    final double avgElements(int[] a) {
        return Double.valueOf(Arrays.stream(a).sum())/(double)a.length;
    }
}
