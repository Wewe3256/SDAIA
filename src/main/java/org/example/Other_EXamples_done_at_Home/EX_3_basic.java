package org.example.Other_EXamples_done_at_Home;

import java.util.Scanner;

public class EX_3_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("writte the Gender M OR F: ");
            String GENDER = sc.nextLine();
            String gender = (GENDER.charAt(0) == 'M') ? "Male" : (GENDER.charAt(0) == 'F') ? "Female" : "Unknown";
            System.out.println(":" + GENDER + " - Gender: " + gender);
        }

    }

