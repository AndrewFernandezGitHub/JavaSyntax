package com.syntax.JavaReviewClass07;

public class Practice5 {
    String weekDay(String day)
    {
        switch (day){
            case "monday":
            return "it is lazy day";
            case "tuesday":
                return "it is lazy day";

            case "wednesday":
                return "it is lazy day";

            case "thursday":
                return "it is lazy day";

            case "friday":
                return "it is lazy day";

            case "saturday":
                return "it is lazy day";

            case "sunday":
                return "it is lazy day";

            default:
                return "No correct option found";
        }
    }

    public static void main(String[] args) {
        Practice5 p=new Practice5();
        p.weekDay("Friday");
        String output=p.weekDay("friday");
        System.out.println(output);
        System.out.println(p.weekDay("Friday"));
    }
}
