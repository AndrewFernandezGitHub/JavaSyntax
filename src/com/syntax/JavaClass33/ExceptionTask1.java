package com.syntax.JavaClass33;

import java.util.InputMismatchException;
import java.util.Scanner;

//How would you handle mismatch exception? Input Mismatch Exception when
//user enters mismatch value then programmer expected
public class ExceptionTask1 {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextInt());
    }catch (InputMismatchException inputMismatchException){
            System.out.println("Please enter the correct type of data integer");
        }
}}