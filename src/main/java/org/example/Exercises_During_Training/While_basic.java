package org.example.Exercises_During_Training;

import java.util.Scanner;

public class While_basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x =(int)(Math.random() *12);
        int y =(int)(Math.random() *10);
        System.out.printf("what is %d * %d ?",x,y);
        int a = sc.nextInt();

        while(a == x*y) {
            x = (int) (Math.random() * 12);
            y = (int) (Math.random() * 10);
            System.out.printf("what is %d * %d ?", x, y);
            a = sc.nextInt();
        }
        System.out.println("game over");
    }
}
