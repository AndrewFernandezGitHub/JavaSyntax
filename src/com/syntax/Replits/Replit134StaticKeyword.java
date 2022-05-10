package com.syntax.Replits;

public class Replit134StaticKeyword {
    static int countVowels(String s){
        s=s.replaceAll("[^AaEeIiOoUu]", "");
        return s.length();
    }
    //test case
    public static void main(String[] args) {
        System.out.println(countVowels("obama"));//3
        System.out.println(countVowels("happy friday! i love weekends"));//9
    }
}
