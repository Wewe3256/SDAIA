package org.example.Exercises_During_Training;

import java.util.Arrays;
import java.util.Scanner;

public class GRD_PCT_STUDENT_MAIN_Call_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mark  and full mark");
        double mark = sc.nextDouble();
        double fullMark = sc.nextDouble();

        //تعريف جديد استدعي فيه الميثود الثانية واحط فيها القيم المطلوبة لحساب الدرجة با الاعتماد على الميثود الثانية
        double grade = GRD_PCT_STUDENT_CLASS.pct(mark, fullMark);
        String grd = GRD_PCT_STUDENT_CLASS.grd(grade);
        System.out.println("yuur pct" + grade + "." + grd);

        String[] statuses = GRD_PCT_STUDENT_CLASS.gr(50, 20, 29);
        System.out.println(Arrays.toString(statuses));

        //String statuses =class1mithod.gr(double[50,20,29]);
        //System.out.println(statuses);
    }

}
