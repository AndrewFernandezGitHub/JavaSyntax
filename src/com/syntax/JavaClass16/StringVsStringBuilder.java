package com.syntax.JavaClass16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s="Andrew Is Great";
        System.out.println(s.replace(" ",""));
        System.out.println(s.concat("ahahhah"));
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("Andrew Is Great");
        stringBuilder.append("hahahha");
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);

    }
}
