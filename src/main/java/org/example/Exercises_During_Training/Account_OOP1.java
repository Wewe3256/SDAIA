package org.example.Exercises_During_Training;

public class Account_OOP1 {
    String name;
    private  double balance;
    static double amountRate=0.04;

    public Account_OOP1(String name, double  balance){
        this.name=name;
        this.balance=balance;


        }
        public Account_OOP1(String name) {
            this.name=name;

        }

    public void setBalance(double balance){
             this.balance=balance;
    }
    public double getBalance(){
        return balance ;
    }
    static double get_month_date(){
        return amountRate/12;
    }
    public double getmonthInt() {
        return balance*get_month_date();

    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withDrow(double amount){
        balance=balance-amount;
    }

}
