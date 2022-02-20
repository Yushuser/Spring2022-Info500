package edu.northeastern.yushu;

public class Student extends Person{
    public Student(String name, int id, int age) {
        super(name, id, age);
    }

    public void takeQuiz(String quiz) {
        System.out.println("Student : "+getName() + " take quiz "+quiz);
    }
}
