package org.example.Other_EXamples_done_at_Home;

import java.util.Scanner;

public class Ex_2_basic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("writte your nationality:");
        String nationality = s.nextLine();

        if (nationality.startsWith("SA")) {
            System.out.println("The nationality is Saudi.");
        } else if (nationality.startsWith("EG")) {
            System.out.println("The nationality is Egyptian.");
        } else {
            System.out.println("Unknown nationality");
        }

        s.close();
    }
}
