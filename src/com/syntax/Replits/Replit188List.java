package com.syntax.Replits;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit188List {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }
        input.close();//good practice to save memory
        for(Integer num: list){
            System.out.print(num+" ");
        }
    }
}
