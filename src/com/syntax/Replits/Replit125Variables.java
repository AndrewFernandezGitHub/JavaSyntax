package com.syntax.Replits;

public class Replit125Variables {
    /*
Declare a static variable number that will hold an integer value:
Access number from the main method and assign value to it.
Create an Object of the class, access number in a nonstatic way and assing value of
200.
Print out number using class name and using instance
Expected Output:
200
200
 */
        static int number;
        public static void main(String[] args) {
            number = 200;
            System.out.println(number);
            Replit125Variables m = new Replit125Variables();
            m.number = 200;
            System.out.println(m.number);
        }
    }

