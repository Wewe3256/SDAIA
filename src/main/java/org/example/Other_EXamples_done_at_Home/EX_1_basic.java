package org.example.Other_EXamples_done_at_Home;

import java.util.Scanner;

public class EX_1_basic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter1 number of Classes"+"Enter number of Student in class");
        int Number_Of_Classes = s.nextInt(); ;
        int students_In_Class =s.nextInt();


        for (int classNumber = 1; classNumber <= Number_Of_Classes; classNumber++) {
            for (int studentNumber = 1; studentNumber <= students_In_Class; studentNumber++) {
                System.out.println("Class " + classNumber + ":");
                System.out.println("  Student " + studentNumber);
            }
        }
    }
}
