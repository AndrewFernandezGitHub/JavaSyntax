package com.syntax.JavaClass16;

public class StringPalindrome {
    public static void main(String[] args) {
//code for finding palindrome
        StringPalindrome task=new StringPalindrome();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("Abbc"));
    }
        boolean isPalindrome(String inputStr){
            String reversedStr = reverseString(inputStr);
            return reversedStr.equals(inputStr);
        }
    String reverseString(String inputString){
        //converting S to string to stringbuilder so that we can reverse
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();

    }
}
