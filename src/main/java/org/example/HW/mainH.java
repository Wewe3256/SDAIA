package org.example.HW;

public class mainH {
    public static void main(String[] args) {
        Person p1 = new Person("Reyom", 24, "alhammra");
        Person p2 = new Person("wijdan",24,"aljouf");


        System.out.println("p1 name is : "+p1.getName());
        System.out.println("p1 age is :"+p1.getAge());
        System.out.println("p1 address is:"+p1.getAddress());

        System.out.println("p2 name is : "+p2.getName());
        System.out.println("p2 age is :"+p2.getAge());
        System.out.println("p2 address is:"+p2.getAddress());

        System.out.println("----------------------------------------------");


        student s1 = new student("rzan",23,"skaka",5508,"math");
        System.out.println(s1.getDetails());
        System.out.println("does HW.student have an ID 5508?"+ s1.ComparableById(s1.getstudentID()));

        System.out.println("----------------------------------------------");

        School v = new School();

        student st1 = new student("mona", 29, "Riyadh", 1007, "Computer Science");
        student st2 = new student("Sara", 28, "jouf", 1123, "Baiology");
        student st3 = new student("Bushra", 22, "Riyadh", 1892, "softwere");


        v.addStudent(st1);
        v.addStudent(st2);
        v.addStudent(st3);


        System.out.println("Students:");
        v.displayAllStudents();

        v.removeStudentById(1892);

        v.displayAllStudents();

        v.sortStudentsByName();
        System.out.println("Students sorted by name:");
        v.displayAllStudents();


        int searchId = 1892 ;
        student foundstudent = v.findstudentById(searchId);
        if(foundstudent != null){
            System.out.println("HW.student could be found by ID "+ searchId);
            System.out.println(foundstudent.getDetails());}
        else {
            System.out.println("HW.student with this id could not be found"+searchId);
        }


        //HW.School.writeStudentsToFile("students.txt");
        //System.out.println("Students written to file.");

        School newSchool = new School();
        newSchool.readStudentsFromFile("students.txt");
        System.out.println("Students read from file:");
        newSchool.displayAllStudents();


    }
}
