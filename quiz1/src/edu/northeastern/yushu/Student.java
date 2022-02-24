package edu.northeastern.yushu;

public class Student extends Person{
    public Student(String name, int id, int age) {
        super(name, id, age);
    }
    public void takeQuiz(Professor professor){
        System.out.println("============================");
        System.out.println("Student Name: " + this.getName() + " take quiz. " );
    }
}
