package com.syntax.Replits;

public class Replit126Variables {
    /*
Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
Expected Output:
3
 */
        static int count;
        public static void main(String[] args) {
            Replit126Variables m = new Replit126Variables();
            count++;
            Replit126Variables x = new Replit126Variables();
            count++;
            Replit126Variables v = new Replit126Variables();
            count++;
            System.out.println(count);
        }
    }

