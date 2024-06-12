package org.example.Exercises_During_Training;

public class sw_Acount_OOP1 extends Account_OOP1 {

    private  double limit;


    public sw_Acount_OOP1(String name, double balance, double limit) {
        super(name, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withDrow(double amount){
        if (getBalance()-amount>=limit) {
            super.withDrow(amount);
        }
    }

}
