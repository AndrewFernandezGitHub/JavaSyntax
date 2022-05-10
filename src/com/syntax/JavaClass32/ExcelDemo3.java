package com.syntax.JavaClass32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {

        String path = "/Users/andrewfernandez/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xlsx.getSheet("Sheet1");
        //System.out.println(xlsx.getSheet("Sheet1"));

        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++){
            Row row=sheet.getRow(i);

            for(int j=0;j<row.getPhysicalNumberOfCells();j++){
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
            //System.out.println(row.getCell(0)+" "+row.getCell(1)); this is hard code for cells
        }

//this loop above prints out whats below simpler

        System.out.print(sheet.getRow(0).getCell(0) + " ");
        System.out.println(sheet.getRow(0).getCell(1));//first row data

        System.out.print(sheet.getRow(1).getCell(0) + " ");
        System.out.println(sheet.getRow(1).getCell(1));//second row data

        System.out.print(sheet.getRow(2).getCell(0) + " ");
        System.out.println(sheet.getRow(2).getCell(1));

    }
}