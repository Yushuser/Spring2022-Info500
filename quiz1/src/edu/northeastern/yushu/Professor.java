package edu.northeastern.yushu;

import java.util.ArrayList;

public class Professor extends Person{
    public Professor(String name, int id, int age) {
        super(name, id, age);
    }

    public void giveQuiz(String quiz){
        System.out.println("Professor : " + getName() + " give quiz " + quiz);
    }
}
