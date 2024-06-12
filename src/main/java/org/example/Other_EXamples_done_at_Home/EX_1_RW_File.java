package org.example.Other_EXamples_done_at_Home;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EX_1_RW_File {
    public static void main(String[] args){
        var f1= new File("C:\\Users\\dev\\Documents\\Engilsh word");
        System.out.println(f1.length());
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        // عرفت معلومات  عن الملف الان اريد اقرا معلوماته المخزنه داخله
        try {
            var fsc =new Scanner(f1);
            while (fsc.hasNext()){
                System.out.println(fsc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        var fileName ="src/main/java/Other_EXamples_done_at_Home/Sorted_word";
        try {
            var pr =new PrintWriter(fileName);
            pr.println("wijdan");
            pr.println("albalwi");
            pr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
