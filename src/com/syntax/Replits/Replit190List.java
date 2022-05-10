package com.syntax.Replits;

import java.util.LinkedList;

public class Replit190List {
    public static void main(String[] args) {
        LinkedList<Integer> fibonacciList=new LinkedList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        for(int i=0;i<8;i++){
            fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i+1));
        }
        fibonacciList.forEach(i-> System.out.print(i+" "));
    }
}
