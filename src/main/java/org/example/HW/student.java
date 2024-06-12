package org.example.HW;

public class student extends Person implements ComparableById {
    private int studentID;
    private String course;

    public student(String name, int age, String address, int studentID, String course) {
        super();
        super.setName(name);
        super.setAge(age);
        super.setAddress (address);
        this.studentID = studentID;
        this.course = course;
    }


    public int getstudentID() {
        return studentID;
    }

    public void setstudentID(int studentID) {
        if(studentID<=0){
            throw new IllegalArgumentException("studentID must be a postive ineteger");
        }
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String getDetails() {
        return "Student{" +
                " Name= " + getName() +
                " age= " + getAge() +
                " address= " + getAddress() +
                ", studentID= " + studentID +
                " course= " + course +
                '}';
    }


    @Override
    public boolean ComparableById(int id) {
        return this.studentID==id;
    }
}
