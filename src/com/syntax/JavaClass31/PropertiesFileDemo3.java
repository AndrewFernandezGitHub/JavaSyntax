package com.syntax.JavaClass31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo3 {
    public static void main(String[] args) throws IOException {
        String path="/Users/andrewfernandez/Desktop/PropertiesTest/Test;";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("IsCrazy","false");
        properties.put("isRich","True");
        properties.store(fileOutputStream,"Added some new fields");



    }
}
