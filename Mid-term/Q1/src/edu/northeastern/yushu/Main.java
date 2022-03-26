package edu.northeastern.yushu;

public class Main {

    public static void main(String[] args) {
        // Question 1: Deep copy shallow copy
        Student student1 = new Student(1, "Serena", 4);
        // Call the copy
        Student student2 = new Student(student1);
        Student student3 = student1;
        student2.setId(2);
        student3.setId(3);
        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
    }
}
