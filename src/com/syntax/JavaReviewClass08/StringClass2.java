package com.syntax.JavaReviewClass08;

import java.util.Locale;

public class StringClass2 {
    public static void main(String[] args) {
        String student="Andrew";
        System.out.println(student.startsWith("A"));
        System.out.println(student.startsWith("O"));
        System.out.println(student.toLowerCase().startsWith("A"));
        System.out.println(student.endsWith("w"));

        String who="MArcela";
        char output=who.charAt(2);
        System.out.println(output);

    }
}
