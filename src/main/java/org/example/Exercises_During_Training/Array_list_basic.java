package org.example.Exercises_During_Training;

import java.util.ArrayList;

public class Array_list_basic {
    public static void main(String[] args){
        ArrayList x= new ArrayList<>();
//ArrayList x= new ArrayList<String>();
        // ArrayList x= new ArrayList<Iteger>();
        System.out.println(x);
        x.add("sara");
        x.add(10);
        x.add("noor");
        x.add(8);
        System.out.println(x);
        // تجيب لي القيمة المخزنه بالموقغ
        System.out.println(x.get(0));
        //يبدل القيمة الموجودة في الموقع 0
        x.add(0,"fars");
        System.out.println(x);
        x.set(0,"wijdan");
        System.out.println(x);
        x.set(2,19);
        System.out.println(x);


        for(Object item: x ){
            if(item instanceof Integer){
                int n=(int)item;
                System.out.println(n);

            }//else if(item instanceof String){
                //String m=(String)item;
                //System.out.println(m);
            //}

        }

    }
}
