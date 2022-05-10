package com.syntax.JavaClass16;

import java.util.Arrays;

public class StringBuilderTask {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Sunday is great");
        System.out.println(stringBuilder.reverse());

        String s="Sunday";
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        s=str.toString();
        System.out.println(s);

        String newStr="Sunday is great";
                String s2=stringBuilder.toString();
        String[] strArr=s2.split(" ");
        System.out.println(Arrays.toString(strArr));

        for (int i=strArr.length-1;i>=0;i--){
            System.out.println(strArr[i]);
        }



    }
}
