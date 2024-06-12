package org.example.Exercises_During_Training;

import java.util.Scanner;

public class Nested_loop_basic {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x =(int)(Math.random() *12);
        int y =(int)(Math.random() *10);
        System.out.printf("what is %d * %d ?",x,y);
        int a = sc.nextInt();
        int godd = 0;
        int wrong =0;
        for(int i=1; i<=5;i++) {
            x = (int) (Math.random() * 12);
            y = (int) (Math.random() * 10);
            for (int b = 1; b <= 3; b++) {
                System.out.printf("what is %d * %d ?", x, y);
                a = sc.nextInt();

                if (a == x * y) {
                    System.out.println("good answer");
                    godd++;
                    break;
                } else {
                    System.out.println("wrong");
                    wrong++;
                }
            }
        }

        System.out.println("total of correct :"+ godd);
        if (godd >= 3){
            System.out.println("are you won " + godd);
        }
        else{
            System.out.println("you are mast try again (your bad answer is:) "+wrong);
        }
}}
