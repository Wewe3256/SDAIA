package org.example.Exercises_During_Training;

import java.util.Scanner;

public class number_with_LENGTH_CharAt_ChAracter_basic {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a new phone number");
        String number= sc.nextLine();

        if(number.length()!=10 || !number.startsWith("05")){
            System.out.println("invalid");
        }

        else{
            int alldigit =0;
            for(int i=0;i<number.length();i++){
                char n =number.charAt(i);
                if (Character.isDigit(n)){
                    alldigit++;
                }

            }

            if(alldigit != 10){
                System.out.println("Invalid");
            }
            else{
                System.out.println("good");
            }
        }
    }
}
