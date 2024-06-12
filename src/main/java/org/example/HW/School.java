package org.example.HW;

import java.io.*;
import java.util.*;

public class School {
    private List<student> students;

    public School() {
        students = new ArrayList<>();
    }


    public void addStudent(student student) {
        students.add(student);
    }

    public void removeStudentById(int studentId) {
        Iterator<student> iterator = students.iterator();
        while (iterator.hasNext()) {
            student student = iterator.next();
            if (student.getstudentID() == studentId) {
                iterator.remove();
                System.out.println("Student with ID" + studentId + "removed successfully.");
                return;
            }
        }
    }

    public void displayAllStudents() {
        System.out.println(" list of thhe sudents");
        for (student student : students) {
            System.out.println(student.getDetails());
            System.out.println();
        }
    }

    public void sortStudentsByName() {
        Collections.sort(students, Comparator.comparing(student::getName));
    }

    public student findstudentById(int studentId) {
        sortStudentsByName();
        int low = 0;
        int high = students.size();

        while (low <= high) {
            int mid = (low + high) / 2;
            student midStudent;
            midStudent = students.get(mid);
            if (midStudent.getstudentID() == studentId) {
                return midStudent;
            } else if (midStudent.getstudentID() < studentId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return null;
    }

    public void readStudentsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String name = parts[0].split(": ")[1];
                int age = Integer.parseInt(parts[1].split(": ")[1]);
                String address = parts[2].split(": ")[1];
                int studentId = Integer.parseInt(parts[3].split(": ")[1]);
                String course = parts[4].split(": ")[1];
                addStudent(new student(name, age, address, studentId, course));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeStudentsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
