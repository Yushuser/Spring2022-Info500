package edu.northeastern.yushu;

public class Student {
    int id;
    String name;
    float gpa;
    // Constructor
    public Student(int id, String name, float gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    // Copy Constructor
    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.gpa = student.gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void printStudent(){
        System.out.println("========================");
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
        System.out.println("GPA : " + this.gpa);
    }
}
