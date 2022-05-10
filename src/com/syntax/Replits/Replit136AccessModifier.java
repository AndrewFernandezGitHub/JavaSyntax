package com.syntax.Replits;
/*For you to do:

        Please create methods with different access modifiers (one for each access modifier) and call them properly in main method one by one

        In each method write the logic accordingly like for private method write the logic in the println Statement as "This is Private Method" accordingly for rest of the methods that have different access modifiers should be a total of 4 outputs, please make sure they are in the same order that is printed below.

        Expected Output:

        This is Private Method
        This is Private Method
        This is Default Method
        This is Default Method
        This is Protected Method
        This is Protected Method
        This is Public Method

 */
public class Replit136AccessModifier {
    private static void privateMethod(){
        System.out.println("This is private method");
    }
    void defaultMethod(){
        System.out.println("This is default method");
    }
    protected static void protectedMethod(){
        System.out.println("This is protected method");
    }
    public void publicMethod(){
        System.out.println("This is public method");
    }

    public static void main(String[] args) {
        Replit136AccessModifier object=new Replit136AccessModifier();
        privateMethod();
        object.defaultMethod();
        protectedMethod();
        object.publicMethod();
        }
    }

