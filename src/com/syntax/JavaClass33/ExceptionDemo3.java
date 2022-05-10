package com.syntax.JavaClass33;

public class ExceptionDemo3 {
    public static void main(String[] args) {

        System.out.println("0");
        try {
            // System.out.println(10/0);
            String name = null;//null pointer exception
            name.length();
            int[] array = new int[-5];
            String [] strArrays = new String[2];
            strArrays[5] = "Issues";

            //String str="aaa";
            //str.charAt(10);
            System.out.println("1");
            // throw new RuntimeException();
        }catch (ArithmeticException arithmeticException){
            System.out.println("2");
        }catch (NullPointerException nullPointerException){
            System.out.println("3");
        }catch (NegativeArraySizeException negativeArraySizeException){
            System.out.println("4");
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("5");
        }catch (Exception exception){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("finally");
        }
        System.out.println("7");
    }
}


