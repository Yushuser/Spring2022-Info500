package edu.northeastern.yushu;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Serena", 002, 23);
        Student s2 = new Student("Sana", 003, 23);
        Professor p1 = new Professor("Ashish", 001, 30);
        s1.subscribe(p1);
        s2.subscribe(p1);
        p1.giveQuiz("5100");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        s2.unSubscribe(p1);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        p1.giveQuiz(" 6205 ");
    }
}
