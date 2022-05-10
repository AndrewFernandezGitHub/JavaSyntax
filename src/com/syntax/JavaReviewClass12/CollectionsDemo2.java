package com.syntax.JavaReviewClass12;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mangoe");
        fruit.add("Orange");

        fruit.remove("Mango");
        System.out.println(fruit);

        ArrayList<Fruit> f=new ArrayList<>();
        f.add(new Fruit("Apple1"));
        f.add(new Fruit("Orange1"));
        f.add(new Fruit("Mango1"));
        f.remove(new Fruit("Mango"));
        System.out.println(f);
        System.out.println(new Fruit("Tangerines"));
        System.out.println(new Fruit("Tangerines"));
    }
}
class Fruit{
    String name;
    Fruit(String name){
        this.name=name;
    }
// instead of checking the address of objects we check if fruit name
    //is same or not if it is same we consider the object also the same

    /*
    equals method when we override it we can check for equality of two objects
    based on the fields of that class instead of addresses
     */

    //used equal keyword and hit next next next then replaced the logic with this return
    //@Override
    //public boolean equals(Object o) {
      // return name.equals(((Fruit)o).name);
   // }


    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
       // if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    //by default the tostring method from the object clas is used to printout the
    //the object, only prints addresses of objects.if we what to print out
    //the actual fioelds of a class, we override the tostring method
    //the below toString conversion is used to crrect the spelling
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
