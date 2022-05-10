package com.syntax.JavaClass16;

public class Split {
    public static void main(String[] args) {
        String s="This is a sentence";
        String[] strArr=s.split(" ");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[3]);
        String s1="This is a sentence.Batch 12 is great. Edward is not great. He is super great.";
        String []strArrr2=s1.split("[.]");
        System.out.println(strArrr2.length);
        System.out.println(strArrr2[3].trim());
    }
}
