package com.syntax.Replits;

public class Replit129Static {
    /*
Declare two static variables to hold
country name
continent
Create a method to display the value of static variables in the following format:
____ located on ____ continent
In the main method assign values to a static variable and execute method display
Expected Output:
Morocco located on Africa continent
 */
        static String countryName;
        static String continent;
        void display() {
            System.out.println(countryName + " located on " + continent + "continent");
        }
        public static void main(String[] args) {
            countryName = "Morocco";
            continent = "Africa";
            Replit129Static m = new Replit129Static();
            m.display();
        }
    }
