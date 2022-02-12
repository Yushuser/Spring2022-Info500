package edu.northeastern.yushu;
//You must create Player class. It has 2 fields: a String name and a score integer. Given an array of Player objects,
public class Player {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
