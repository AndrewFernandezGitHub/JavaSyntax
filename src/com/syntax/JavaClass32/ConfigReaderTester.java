package com.syntax.JavaClass32;


import com.syntax.Util.ConfigReader;

import java.io.IOException;

public class ConfigReaderTester {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("URL"));
        System.out.println(ConfigReader.getProperty("URL"));
    }
}
