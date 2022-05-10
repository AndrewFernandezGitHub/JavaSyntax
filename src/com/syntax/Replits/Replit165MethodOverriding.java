package com.syntax.Replits;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Replit165MethodOverriding {
    public static void main(String[] args) {
        ChildR165 obj = new ChildR165();
        obj.PublicMethod();
        obj.ProtectedMethod();
        obj.DefaultMethod();

    }
}
class ParentR165{
    public void PublicMethod(){
        System.out.println("I am a Parent public method");
    }
    protected void ProtectedMethod(){
        System.out.println("I am a Parent protected method");
    }
    void DefaultMethod(){
        System.out.println("I am a Parent default method");
    }
    private void PrivateMethod(){
        System.out.println("I am a Parent private method");
    }
}
class ChildR165 extends ParentR165{
    public void PublicMethod(){
        System.out.println("I am a child public method");
    }
    protected void ProtectedMethod(){
        System.out.println("I am a child protected method");
    }
    void DefaultMethod() {
        System.out.println("I am a child default method");
    }
    private void PrivateMethod(){
        System.out.println("I am a child private method");
    }
}