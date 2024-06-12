package org.example.Other_EXamples_done_at_Home;

import java.util.Scanner;

public class EX_4_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers want to add?");
        int count = sc.nextInt();

        int[] n = new int[count];
        int sum = 0;
        for (int i = 0; i < count; i++) {
            n[i] = (int) (Math.random() * 100) + 1;
            sum += n[i];
            System.out.print(n[i] + " ");
        }

        System.out.println("the Sum of numbers is:" + sum);
    }

}


