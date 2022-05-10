package com.syntax.JavaClass24;
abstract class File{
    abstract void open();
     void edit(){
         System.out.println("editing a class");
     }
     void close(){
         System.out.println("Closing the file");
     }
}
class JavaFile extends File{
    @Override
    void open(){
        System.out.println("USe intellij to open java files");
    }
}
class WordFile extends File{
    @Override
    void open(){
        System.out.println("Use mircosoft word to open this file");
    }
}
class PDFFile extends File{
    @Override
    void open(){
        System.out.println("Use adobe to reader to open the file");
    }
}
public class Task2 {
    /*Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract. Create
    3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
    implementation of open behaviour: Example: to open .java file we need notepad++ or
    sublime text, to open .doc file we need Microsoft word to be installed etc
     */
    public static void main(String[] args) {
        /*if a method is not present inside the parent class, we can't call that
        method using polymorphism
         */

        File[] files={new JavaFile(),new PDFFile(),new WordFile()};
        for(int i=0;i<files.length;i++){
            files[i].open();
            files[i].edit();
            files[i].close();
        }
    }


    //int i =0;
//while(i < file.length){
     //   file[i].open();
       // file[i].edit();
       // file[i].close();
       // i++;
    }





