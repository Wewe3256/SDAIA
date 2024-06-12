package org.example.Exercises_During_Training;

import java.util.Scanner;

public class IF_Switch_WorK_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Exercises_During_Training.day:");
        int day = sc.nextInt();

        if (day == 7 || day >= 1 && day <= 4) {
            System.out.println("work Exercises_During_Training.day");
        } else if (day == 5 || day == 6) {
            System.out.println("off Exercises_During_Training.day");
        } else {
            System.out.println("invalid");
        }
        System.out.println("this Exercises_During_Training.day is");
         switch (day){
            case 1->System.out.println("sunday");
            case 2->System.out.println("monday");
            case 3->System.out.println("tuesday");
            case 4->System.out.println("wednsday");
            case 5->System.out.println("thuresday");
            case 6->System.out.println("friday");
            case 7->System.out.println("saturday");
            default -> System.out.println("worng the Exercises_During_Training.day of week just 7");
        }
    }
}
