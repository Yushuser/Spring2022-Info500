package edu.northeastern.yushu;

public class Student extends Person{
    public Student(String name, int id, int age) {
        super(name, id, age);
    }

    public void takeQuiz() {
        System.out.println("Student : "+name + " take quiz");
    }
}
