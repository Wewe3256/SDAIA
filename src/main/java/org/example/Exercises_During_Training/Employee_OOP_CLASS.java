package org.example.Exercises_During_Training;

import java.time.LocalDate;

public class Employee_OOP_CLASS {
     String name;
    double salary;
    int  hireYear;

    public Employee_OOP_CLASS(String name, double salary, int hireYear){
        this.name=name;
        this.salary=salary;
        this.hireYear=hireYear;
    }
        public double salary1(){
        return  salary*12;
        }

        public int period(){

        int yareNow=LocalDate.now().getYear();
        return yareNow- hireYear;

        }
}
