package org.example.HW;

public class Fizzbuzz_HW1 {
    public static void main(String[] args){
        System.out.println("I hope MY homework is correct");

        for (int i=1;i<=100;i++){
            if(i%3==0){
                System.out.println("fizz");
            }else if (i%5==0) {
                    System.out.println("buzz");
            }else if (i%7==0){
                System.out.println("jazz");
            }else if (i%3==0&&i%5==0){
                System.out.println("fizz buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
