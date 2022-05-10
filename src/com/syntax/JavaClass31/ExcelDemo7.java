package com.syntax.JavaClass31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/andrewfernandez/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheetAt(0);
        Row row=sheet.createRow(6);
      row.createCell(0).setCellValue("Andrew");
      row.createCell(1).setCellValue("Marcela");
      row.createCell(2).setCellValue("16");
      row.createCell(3).setCellValue("17");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);



    }
}
