package com.syntax.Replits;

public class Replit151Inheritance {
    static int sum2d(int[][] a){
        int sum=0;
        for(int[] i:a){
            for(int j:i){
                sum+=j;
            }
        }
        return sum;
    }
}
class R151test extends Replit151Inheritance{
    public static void main(String[] args) {
        int [][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Replit151Inheritance.sum2d(a));
    }
}
