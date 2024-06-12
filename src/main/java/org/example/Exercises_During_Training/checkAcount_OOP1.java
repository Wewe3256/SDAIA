package org.example.Exercises_During_Training;

public class checkAcount_OOP1 extends Account_OOP1 {

    public checkAcount_OOP1(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withDrow(double amount) {
        if (getBalance()-amount>=0){
            super.withDrow(amount);
        }

    }

}

