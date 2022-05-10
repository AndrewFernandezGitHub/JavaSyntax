package com.syntax.JavaClass19;

public class This {
    int a;
    int b;
    public void setData(int a,int b){
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) {
        This t=new This();
        t.setData(4,3);
        System.out.println(t.a);
        System.out.println(t.b);
    }
}
