package org.example.Other_EXamples_done_at_Home;

public class EX1_OOP {
    private int numberOfBooks;


    public EX1_OOP() {
        this.numberOfBooks = 0;
    }


    public void addBooks() {
        numberOfBooks++;
        System.out.println("Added a new Book:Total Books " + numberOfBooks);
    }


    public void printNumberOfBooks() {
        System.out.println("Number of Books in the library: " + numberOfBooks);
    }


}
