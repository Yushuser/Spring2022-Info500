package edu.northeastern.yushu;

public class Main {

    public static void main(String[] args) {
        Triangle t = new Triangle("Triangle", "green", 10);
        Parallelogram p = new Parallelogram("Parallelogram", "blue", 9,8,7);
        t.printShape();
        p.printShape();
    }
}
