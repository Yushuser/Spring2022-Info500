package edu.northeastern.yushu;

public class Main {

    public static void main(String[] args) {
        Triangle t = new Triangle("Triangle", "green", 10);
        Rhombus r = new Rhombus("Rhombus", "blue", 6,8);
        t.printShape();
        r.printShape();
    }
}
