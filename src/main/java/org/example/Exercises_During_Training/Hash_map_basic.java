package org.example.Exercises_During_Training;

import java.util.HashMap;

public class Hash_map_basic {
    public static void main(String[] args){

        HashMap<Integer,String> student =new HashMap<Integer,String>();
        student.put(1,"AHMAD");
        student.put(2,"mona");
        student.put(3,"wijdan");
        student.put(4,"sara");

        System.out.println(student);
        System.out.println(student.keySet());
        System.out.println(student.values());
        System.out.println(student.size());
        //تحذف لي المدخل كامل
        System.out.println(student.remove(2));
        System.out.println(student);
        System.out.println(student.remove(1));
        System.out.println(student);

         for(var item:student.entrySet()){
             System.out.println(item.getKey());
             System.out.println(item.getValue());

         }
    }
}
