package com.syntax.JavaClass33;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        System.out.println("0");
        try {
           // System.out.println(10/0);
            /*String name = null;
            name.length();
            int[] array = new int[-5];
            String [] strArrays = new String[2];
            strArrays[5] = "Issues";
             */
            //String str="aaa";
            //str.charAt(10);
            throw new RuntimeException();
        }catch (ArithmeticException arithmeticException){
            System.out.println("1");
        }catch (NullPointerException nullPointerException){
            System.out.println("2");
        }catch (NegativeArraySizeException negativeArraySizeException){
            System.out.println("3");
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("4");
        }catch (Exception exception){
            System.out.println("SOmething went wrong");
        }
        System.out.println("6");
    }
}



