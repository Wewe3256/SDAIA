package org.example.Exercises_During_Training;

public class mainAcount_OOP1 {
    public static void main(String[] args) {
       // var x = new Exercises_During_Training.Account("sara", 500);
        //var y = new Exercises_During_Training.Account("mona", 200);
        var x = new Account_OOP1("sara");
        var y = new Account_OOP1("mona");
        var m = new checkAcount_OOP1("sosn", 10000);
        var b = new sw_Acount_OOP1("sara",10000, 300);



        System.out.println(x.name);
        System.out.println(y.name);
        System.out.println(m.name);
        System.out.println(b.name);

        m.withDrow(8000);
        System.out.println(m.getBalance());
        b.withDrow(8);
        System.out.println(m.getBalance());
        x.deposit(10);
        System.out.println(x.getBalance());

        System.out.println(m.getmonthInt());
        System.out.println(m.getBalance());
        System.out.println(x.getmonthInt());
        System.out.println(x.get_month_date());
    }

}
