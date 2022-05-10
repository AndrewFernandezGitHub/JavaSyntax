package com.syntax.JavaClass30;
//created a clas, entered  2 fields, created methods to get the values of the fields
//created a class,create the objects, then storing the objects in this class inside a set
//create a class, create its objects, store the objects into a set, print it

import java.util.HashSet;
import java.util.Set;

public class B12Entry {

    String key;
    Double value;
    String name = "Andrew";

    public B12Entry(String key, Double value) {
        this.key = key;
        this.value = value;
    }

    String getKey() {
        return key;
    }

    Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "B12Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
    class Test {
        //below is a set of entries. the entries are objects of the class.
        public static void main(String[] args) {
            Set<B12Entry> entries = new HashSet<>();
            entries.add(new B12Entry("Apple", 12.30));
            entries.add(new B12Entry("Mango", 15.0));
            entries.add(new B12Entry("Banana", 20.00));
            entries.add(new B12Entry("Kiwi", 12.00));
            System.out.println(entries);

            //once objects of class are stored int set we can do this to recover
            // individual elements from object

            for (B12Entry b : entries) {
                System.out.println(b);
                System.out.println(b.getKey());
                System.out.println(b.getValue());
            }


        }
    }
