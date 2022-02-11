package edu.northeastern.yushu;
//3) Override the getArea() and getPerimeter() getter methods of Shape in triangle and Parallelogram to give desired outptput.
//Class: Parallelogram: Inherits Shape
public class Parallelogram extends Shape {
    //Fields: base, height, side
    private int base;
    private int height;
    private int side;
    //Constructor: Parallelogram (base, height, side)
    //Parallelogram (side) → If single side is given then all sides to same value.
    public Parallelogram(int base, int height, int side) {
        super();
        this.base = base;
        this.height = height;
        this.side = side;
    }
    public Parallelogram(int side) {
        super();
        this.side = side;
        this.base = side;
    }
    public Parallelogram(String name, String color, int base, int height, int side){
        super(name, color);
        this.side = side;
        this.base = base;
        this.height = height;
    }
    //3) Override the getArea() and getPerimeter() getter methods of Shape in triangle and Parallelogram to give desired output.
    @Override
    public int getArea() {
        return this.base * this.height;
    }
    @Override
    public int getPerimeter() {
        return (this.base + this.side) * 2;
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
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
}
