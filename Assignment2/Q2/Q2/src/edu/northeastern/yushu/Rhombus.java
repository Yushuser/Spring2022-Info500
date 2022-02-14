package edu.northeastern.yushu;

public class Rhombus extends Shape{
    private int diagonal1;
    private int diagonal2;
    public Rhombus(String name, String color,int diagonal1, int diagonal2) {
        super(name,color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhombus(String name, String color,int diagonal) {
        super(name,color);
        this.diagonal1 = diagonal;
        this.diagonal2 = diagonal;
    }

    @Override
    public int getArea() {
        return diagonal1 * diagonal2 / 2;
    }

    @Override
    public int getPerimeter() {
        return 2 * (int)Math.sqrt(diagonal1 * diagonal1 + diagonal2 * diagonal2);
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }
}
