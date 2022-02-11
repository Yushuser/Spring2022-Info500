package edu.northeastern.yushu;
//Class: Triangle: Inherits Shape
public class Triangle extends Shape {
    //Fields: base, height
    private int base;
    private int height;
    //Constructors: triangle(side) → If single side is given then all sides to same value.
    public Triangle(int side) {
        super();
        this.base = side;
        this.height = side * (int)Math.sqrt(3) / 2;
    }
    public Triangle(String name, String color, int side) {
        super(name, color);
        this.base = side;
        this.height = side * (int)Math.sqrt(3) / 2 ;
    }
    //3) Override the getArea() and getPerimeter() getter methods of Shape in triangle and Parallelogram to give desired output.
    @Override
    public int getArea() {
        return this.base * this.height /2;
    }
    @Override
    public int getPerimeter() {
        return this.base * 3;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
