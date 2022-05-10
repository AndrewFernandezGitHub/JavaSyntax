package com.syntax.JavaClass31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo2 {
    public static void main(String[] args) throws IOException {
        //first step locating the file that we want to read
        String path="/Users/andrewfernandez/Desktop/PropertiesTest/Config.properties";
        //navigating to that location
        FileInputStream fileInputStream=new FileInputStream(path);

        //that special class which knows how to read the .properties file
        Properties properties=new Properties();

        //loading all the data from the file to properties object
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));



    }
}


