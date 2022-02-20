package edu.northeastern.yushu;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Serena", 002, 23);
        Professor p1 = new Professor("Ashish", 001, 30);
        s1.takeQuiz("5100");
        p1.giveQuiz("5100");
    }
}
