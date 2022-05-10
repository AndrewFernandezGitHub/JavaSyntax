package com.syntax.JavaReviewClass13;

import java.io.File;
import java.util.Scanner;

public class FileDemo1 {
    public static void main(String[] args) {
        String path="src/com/syntax/JavaReviewClass13/Notes.txt";
        File file=new File(path);

        Scanner scanner=new Scanner(path);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
