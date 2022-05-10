package com.syntax.JavaClass16;

public class Reverse {
    public static void main(String[] args) {
        //get the words from syntax, reverse words, append the words to get the sentence back
        String s = "Sunday is great";
        Reverse reverse = new Reverse();
        //System.out.println(reverse.reverseString(s));
        String []strArray=s.split(" ");
        //System.out.println(strArray[0]); will print word at given index
        for(int i=0; i<strArray.length;i++){
            reverse.reverseString(strArray[i]);
            System.out.println(reverse.reverseString(strArray[i])+" ");
        }
    }
    String reverseString(String inputString){
    //converting S to string to stringbuilder so that we can reverse
        StringBuilder stringBuilder=new StringBuilder(inputString);
    stringBuilder.reverse();
    return stringBuilder.toString();

    }
}