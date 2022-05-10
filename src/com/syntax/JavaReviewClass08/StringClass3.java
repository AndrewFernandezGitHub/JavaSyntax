package com.syntax.JavaReviewClass08;

public class StringClass3 {
    public static void main(String[] args) {

        String company="     asasas   asasas  as  ";
        System.out.println(company.trim());//removes space at beginning and end of variable

        String me="Aaaaaaa Bbbbb  AbAbAbAb  BaAbAbAbAb CBABC";
        System.out.println(me.replaceAll("B","1"));

        String batch = "Batch12";
        String course = "Sdet";

        if ("Batch12".equals(batch) && "Sdet".equals(course)) {
            System.out.println("You will get the link to MS's lecture");
        } else {
            System.out.println("Watch my youtube chanel");
        }

        if ("Batch12".equalsIgnoreCase(batch) && "Sdet".equalsIgnoreCase(course)) {
            System.out.println("Now all types of inputs are accepted");
        }
    }
}