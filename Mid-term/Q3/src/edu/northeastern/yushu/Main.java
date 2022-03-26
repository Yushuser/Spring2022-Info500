package edu.northeastern.yushu;

public class Main {

    public static void main(String[] args) {
        Psychiatrist p1 = new Psychiatrist();

        Moody happy = new Happy();
        Moody sad = new Sad();

        p1.examine(happy);
        p1.observe(happy);
        p1.examine(sad);
        p1.observe(sad);
    }
}
