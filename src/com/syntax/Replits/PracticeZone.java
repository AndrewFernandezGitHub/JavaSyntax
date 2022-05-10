package com.syntax.Replits;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class PracticeZone {
    public static void main(String[] args) throws IOException {
String path ="/Users/andrewfernandez/Downloads/Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet =xssfWorkbook.getSheet("SHeet1");
        Row row=sheet.getRow(0);
        System.out.println(row.getCell(0));
    }
}