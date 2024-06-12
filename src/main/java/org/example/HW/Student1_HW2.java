package org.example.HW;

public class Student1_HW2 {
    private String name;
    private int id;

    public Student1_HW2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // (يجب ان تكون نفس نوع الشيء يلي ابي ارجعه ونكون مفتوحة المصدر ليست void لان الVoid تغير قيمة لاترجعها)الميثود git


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


@Override
    public String toString() {
      return id + ": " + name;
   
    }
}

