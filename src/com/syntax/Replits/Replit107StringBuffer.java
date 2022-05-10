package com.syntax.Replits;

public class Replit107StringBuffer {
    /*
How would you reverse a String using StringBuffer Class
Given String = "Hello Friends"
Expected Output:
sdneirF olleH
 */
        public static void main(String[] args) {
            String text = "Hello Friends";
            StringBuilder stringBuilder = new StringBuilder(text);
            System.out.println(stringBuilder.reverse());
        }
    }
