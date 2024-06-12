package org.example.HW;

import java.util.ArrayList;

public class StudentManger_HW2 {
    private ArrayList<Student1_HW2> students;
    //private ArrayList students= new ArrayList<Student>();


    public StudentManger_HW2() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student1_HW2 onterStudent) {
        students.add(onterStudent);
    }


    public Student1_HW2 getStudentById(int id) {
        for (Student1_HW2 s : students) {
            if (s.getId()== id) {
                return s;
            }
        }
        return null;
    }

    // دالة لاسترجاع جميع الطلاب في القائمة
    public ArrayList<Student1_HW2> getAllStudents() {
        return students;
    }

    public boolean removStudent(int id){
        for(Student1_HW2 b : students){
            if(b.getId()==id){
                students.remove(b);
                break;
            }
        }
        return false;
    }
}
