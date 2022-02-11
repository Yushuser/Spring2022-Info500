package edu.northeastern.yushu;

//Question1: Implement given program using copy constructor by creating a class
//Student with two parameter : 1. int rollNum  2. String name
public class Student {
    private int rollNumber;
    private String name;
    //Constructor
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
    //Copy Constructor
    public Student(Student student){
        this.rollNumber = student.rollNumber;
        this.name = student.name;
    }
    public int printRoll() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String printName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}