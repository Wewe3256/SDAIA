package org.example.HW;

public class Main_STU_MAN_HW2 {
    public static void main(String[] args) {
        StudentManger_HW2 manager = new StudentManger_HW2();

        Student1_HW2 student11 = new Student1_HW2("mona", 1);
        Student1_HW2 student2 = new Student1_HW2("sara", 2);
        Student1_HW2 student3 = new Student1_HW2("noor", 3);
        Student1_HW2 student4 = new Student1_HW2("noof", 4);

        manager.addStudent(student11);
        manager.addStudent(student2);
        manager.addStudent(student3);
        manager.addStudent(student4);
        //System.out.println(student11);
        //System.out.println(student2);
        //System.out.println(student3);
        //System.out.println(" student2");

        System.out.println(" display studen2 by id ");
        Student1_HW2 s=manager.getStudentById(2);
        if(s != null){
            System.out.println("  name  "+s.getName()+"  ID  "+s.getId());
        }else {
            System.out.println("NO HW.student Found");
        }

        System.out.println("all HW.student before any update");
        System.out.println(manager.getAllStudents());


        System.out.println("remove student2 by ID");
        Boolean Removr = manager.removStudent(2);
        if(Removr.equals(false)){
            System.out.println(" done remove student2 by ID");
        }else{
            System.out.println("no HW.student found to remove");
        }


        System.out.println("all HW.student after remove");
        System.out.println(manager.getAllStudents());
    }
}




