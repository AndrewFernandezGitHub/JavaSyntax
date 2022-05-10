package com.syntax.JavaClass16;
//.replace can start changing the string
public class Test {
    public static void main(String[] args) {
        String str="Batch 12 is good";
        System.out.println(str.replace("good","Great"));
        System.out.println(str.replace("o","0"));
        System.out.println(str.replace(" ",""));//this is how to remove spaces
        System.out.println(str.replace("Batch","Andrew"));
    }
}
