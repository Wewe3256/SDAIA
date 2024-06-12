package org.example.Exercises_During_Training;

import java.util.Scanner;

public class IF_With_Math_Random_Casting_basic {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x =(int)(Math.random() *25);
        int y =(int)(Math.random() *25);
        //casting;
        //System.out.printf("what is %d * %d ?",x,y);
        System.out.println("what is "+ x +"*"+ y);
        int a = sc.nextInt();


        if(a == x*y){
            System.out.println("good answer");
        }
        else {
            System.out.println("wrong");
        }
    }
}
