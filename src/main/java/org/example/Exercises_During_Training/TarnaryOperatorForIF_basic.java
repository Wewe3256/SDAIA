package org.example.Exercises_During_Training;

import java.util.Scanner;

public class TarnaryOperatorForIF_basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println(a % 2==0 ? "even" : "odd");
    }
}
